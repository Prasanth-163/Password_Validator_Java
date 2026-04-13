import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nWelcome to SafeLog Password Validator");
        System.out.println("Password must follow these rules:");
        System.out.println("1. At least 8 characters long");
        System.out.println("2. Must contain at least one uppercase letter");
        System.out.println("3. Must contain at least one digit\n");

        while (true) {

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            boolean hasUpper = false;
            boolean hasDigit = false;

            if (password.length() < 8) {
                System.out.println("Password too short\n");
                continue;
            }

            for (int i = 0; i < password.length(); i++) {

                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpper = true;
                }

                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            if (!hasUpper) {
                System.out.println("Missing uppercase letter\n");
                continue;
            }

            if (!hasDigit) {
                System.out.println("Missing digit\n");
                continue;
            }

            System.out.println("Password is valid");
            break;
        }

        sc.close();
    }
}