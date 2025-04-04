import javax.swing.*;
import java.awt.*;

public class RegistrationDialog {
    public static void main(String[] args) {
        // 1. Окно с приветствием
        int response = JOptionPane.showConfirmDialog(null, "Добро пожаловать! Хотите зарегистрироваться?", "Регистрация", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.NO_OPTION) {
            System.exit(0);
        }

        // 2. Окно для ввода логина
        String login;
        while (true) {
            login = JOptionPane.showInputDialog(null, "Введите логин (больше 5 символов, без пробелов):", "Логин", JOptionPane.PLAIN_MESSAGE);
            if (login != null && login.length() > 5 && !login.contains(" ")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Логин некорректен! Пожалуйста, попробуйте снова.");
            }
        }

        // 3. Окно для ввода пароля
        String password;
        while (true) {
            password = JOptionPane.showInputDialog(null, "Введите пароль (больше 8 символов, без пробелов, хотя бы одна цифра и одна буква):", "Пароль", JOptionPane.PLAIN_MESSAGE);
            if (isValidPassword(password)) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Пароль некорректен! Пожалуйста, попробуйте снова.");
            }
        }

        // 4. Окно для повторного ввода пароля
        String repeatPassword;
        while (true) {
            repeatPassword = JOptionPane.showInputDialog(null, "Повторите пароль:", "Повтор пароля", JOptionPane.PLAIN_MESSAGE);
            if (password.equals(repeatPassword)) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Пароли не совпадают! Пожалуйста, попробуйте снова.");
            }
        }

        // 5. Окно с информацией об успешной регистрации
        JOptionPane.showMessageDialog(null, "Регистрация успешна!", "Регистрация", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isValidPassword(String password) {
        if (password == null || password.length() <= 8 || password.contains(" ")) {
            return false;
        }
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        return hasLetter && hasDigit;
    }
}

