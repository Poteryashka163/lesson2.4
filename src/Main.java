import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.print("Введите Логин: ");
        String log = login.next();
        System.out.print("Введите Пароль: ");
        String pass = login.next();
        System.out.print("Введите Подтверждение пароля: ");
        String confPass = login.next();

        try {
            CheckCredentials.checkCredentials("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}