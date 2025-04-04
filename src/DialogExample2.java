import javax.swing.JOptionPane;

public class DialogExample2 {
    public static void main(String[] args) {
        int response1 = JOptionPane.showConfirmDialog(null,
                "Вы хотите продолжить?",
                "Первый вопрос",
                JOptionPane.YES_NO_OPTION);

        int response2 = JOptionPane.showConfirmDialog(null,
                "Вы уверены в своем выборе?",
                "Второй вопрос",
                JOptionPane.YES_NO_OPTION);

        String message = "";

        if (response1 == JOptionPane.YES_OPTION && response2 == JOptionPane.YES_OPTION) {
            message = "Вы решили продолжить и вы уверены в своем выборе!";
        } else if (response1 == JOptionPane.YES_OPTION && response2 == JOptionPane.NO_OPTION) {
            message = "Вы решили продолжить, но не уверены в своем выборе.";
        } else if (response1 == JOptionPane.NO_OPTION && response2 == JOptionPane.YES_OPTION) {
            message = "Вы не хотите продолжать, но уверены в этом решении.";
        } else if (response1 == JOptionPane.NO_OPTION && response2 == JOptionPane.NO_OPTION) {
            message = "Вы не хотите продолжать и не уверены в своем выборе.";
        }

        JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.INFORMATION_MESSAGE);
    }
}

