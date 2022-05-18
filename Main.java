package Java.ATM;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Account account = new Account("Eray", "256", 1000);

        atm.progress(account);
        
        System.out.println("****************************");
        System.out.println("Exiting...");
    }
    
    
    
    
}
