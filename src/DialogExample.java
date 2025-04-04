import javax.swing.JOptionPane;

public class DialogExample {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Введите ваше имя:", "Имя пользователя", JOptionPane.QUESTION_MESSAGE);

        // Проверяем, было ли введено имя
        if (name != null && !name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Здравствуйте, " + name + "!", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Вы не ввели имя!", "Ошибка", JOptionPane.WARNING_MESSAGE);
        }
    }
}

