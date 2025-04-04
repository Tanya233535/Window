import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NameDialog {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Press Space to Show Name");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Добавляем слушателя клавиатуры
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Проверяем, нажата ли клавиша "Пробел"
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    // Показываем диалоговое окно с вашим именем
                    JOptionPane.showMessageDialog(frame, "Метелица Татьяна");
                }
            }
        });

        frame.setVisible(true);
    }
}

