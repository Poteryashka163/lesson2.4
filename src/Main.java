import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new User("login","password","password");
        System.out.print("Введите Логин: ");
        String login = scanner.next();
        System.out.print("Введите Пароль: ");
        String password = scanner.next();
        System.out.print("Введите Подтверждение пароля: ");
        String confirmPassword = scanner.next();

        try {
            CheckCredentials.checkCredentials("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}