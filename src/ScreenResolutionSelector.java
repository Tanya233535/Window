import javax.swing.*;
import java.awt.*;

public class ScreenResolutionSelector {

    public static void main(String[] args) {
        String[] resolutions = {"800x600", "1024x768", "1280x1024", "1920x1080"};

        // Создаем выпадающий список
        JComboBox<String> resolutionComboBox = new JComboBox<>(resolutions);

        // Создаем диалоговое окно с выбором разрешения
        int result = JOptionPane.showConfirmDialog(null, resolutionComboBox, "Выберите разрешение экрана",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {

            String selectedResolution = (String) resolutionComboBox.getSelectedItem();
            String[] dimensions = selectedResolution.split("x");
            int width = Integer.parseInt(dimensions[0]);
            int height = Integer.parseInt(dimensions[1]);

            // Создаем новое окно с выбранными размерами
            JFrame frame = new JFrame("Окно с разрешением " + selectedResolution);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(width, height);
            frame.setLocationRelativeTo(null); // Центрируем окно на экране
            frame.setVisible(true);
        } else {
            // Если пользователь нажал "Отмена", просто завершаем программу
            System.exit(0);
        }
    }
}

