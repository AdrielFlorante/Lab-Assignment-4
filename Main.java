/*
 * Adriel Florante 2BSCS-1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        passMan passCheck = new passMan();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password:");

        // stuff here to try logging in
        while (true) {
            try {
                passCheck.login(scanner.nextLine());
            } catch (maxAttemptsExceeded e) {
                System.out.println(e.getMessage());
                System.exit(0);
            } catch (incorrectPassException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
