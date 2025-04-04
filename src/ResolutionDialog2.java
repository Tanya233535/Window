import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResolutionDialog2 extends JDialog {
    private String selectedResolution;

    public ResolutionDialog2(Frame parent) {
        super(parent, "Выбор разрешения", true);
        setLayout(new GridLayout(0, 1));

        JRadioButton resolution800x600 = new JRadioButton("800x600");
        JRadioButton resolution1024x768 = new JRadioButton("1024x768");
        JRadioButton resolution1280x720 = new JRadioButton("1280x720");
        JRadioButton resolution1920x1080 = new JRadioButton("1920x1080");

        ButtonGroup group = new ButtonGroup();
        group.add(resolution800x600);
        group.add(resolution1024x768);
        group.add(resolution1280x720);
        group.add(resolution1920x1080);

        // Добавляем радиокнопки в диалог
        add(resolution800x600);
        add(resolution1024x768);
        add(resolution1280x720);
        add(resolution1920x1080);

        JButton okButton = new JButton("ОК");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resolution800x600.isSelected()) {
                    selectedResolution = "800x600";
                } else if (resolution1024x768.isSelected()) {
                    selectedResolution = "1024x768";
                } else if (resolution1280x720.isSelected()) {
                    selectedResolution = "1280x720";
                } else if (resolution1920x1080.isSelected()) {
                    selectedResolution = "1920x1080";
                }
                dispose(); // Закрываем диалог
            }
        });

        add(okButton);
        pack();
        setLocationRelativeTo(parent); // Центрируем диалог относительно родительского окна
    }

    public String getSelectedResolution() {
        return selectedResolution;
    }

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Главное окно");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 200);
        mainFrame.setLocationRelativeTo(null); // Центрируем основное окно

        // Показать диалог выбора разрешения
        ResolutionDialog2 resolutionDialog = new ResolutionDialog2(mainFrame);
        resolutionDialog.setVisible(true);

        String resolution = resolutionDialog.getSelectedResolution();
        if (resolution != null) {
            // Разделяем ширину и высоту
            String[] dimensions = resolution.split("x");
            int width = Integer.parseInt(dimensions[0]);
            int height = Integer.parseInt(dimensions[1]);

            // Создаем новое окно с выбранным разрешением
            JFrame resolutionFrame = new JFrame("Окно с разрешением " + resolution);
            resolutionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            resolutionFrame.setSize(width, height);
            resolutionFrame.setLocationRelativeTo(null); // Центрируем новое окно
            resolutionFrame.setVisible(true);
        }
    }
}

