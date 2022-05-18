package Java.ATM;

import java.util.Scanner;

public class Login {

    public boolean login (Account account)  { 

        Scanner scanner = new Scanner(System.in);

        String userName;    
        String UserPw;     

        System.out.print("User Name: ");
        userName = scanner.nextLine();
        System.out.print("Password: ");
        UserPw = scanner.nextLine();

        if (account.getUserName().equals(userName) && account.getUserPw().equals(UserPw)) {
            return true;
        }

        else {
            return false;
        }



    }
    
}
