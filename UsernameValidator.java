import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean isValid = true;

        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            // Verificare lungime
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                isValid = false;
            }

            // Verificare spatii si cifre
            else
            {
                boolean hasDigit = false;
                boolean hasSpaces = false;
                for (char c : username.toCharArray()) {
                    if (Character.isSpaceChar(c)) {
                        System.out.println("Eroare: Username-ul nu poate conține spatii.");
                        isValid = false;
                        hasSpaces = true;
                        break;

                    }
                    if (Character.isDigit(c)) {
                        hasDigit = true;
                        isValid = true;
                        break;

                    }
                }

                if (!hasDigit && !hasSpaces) {
                    System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                    isValid = false;

                }
            }

        } while (!isValid); // repetam pana cand e valid

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}