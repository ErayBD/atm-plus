package Java.ATM;

import java.util.Scanner;

public class ATM {
    
    public void progress(Account account) {    

        Login login = new Login();

        Scanner scanner = new Scanner (System.in);

        System.out.println("\nWelcome to our Bank!");
        System.out.println("****************************");

        int loginAttempt = 3;   

        while (true) {
            if (login.login(account)) {
                System.out.println("****************************");
                System.out.println("--> Login Succesful...");
                System.out.println("****************************");
                break;
            }

            else {
                System.out.println("****************************");
                System.out.println("--> Login Failure...");
                loginAttempt--;
                System.out.println("Remaining login attempt: " + loginAttempt);
                System.out.println("****************************");
            }

            if (loginAttempt == 0) {
                System.out.println("You are out of login attempt...");
                return;
            }
        }
        
        String menu = "1 - Balance Check\n"
                    + "2 - Deposit\n"
                    + "3 - Withdrawal\n"
                    + "4 - Exit";

        System.out.println(menu);

        while (true) {
            System.out.println("****************************");
            System.out.print("Choose an options: ");
            String option = scanner.nextLine();

            if (option.equals("4")) {
                break;
            }

            else if (option.equals("1")) {
                System.out.println("Your balance: " + account.getCash());
            }

            else if (option.equals("2")) {
                System.out.print("How much to deposit: ");
                int tempAmount = scanner.nextInt();
                scanner.nextLine();     // to be safe

                account.cashIn(tempAmount);
            }

            else if (option.equals("3")) {
                System.out.print("How much to withdrawal: ");
                int tempAmount = scanner.nextInt();
                scanner.nextLine();     // to be safe

                account.cashOut(tempAmount);
            }

            else {
                System.out.println("Invalid option selected.\n");
            }
        }
        scanner.close();
    }
}
