package Java.ATM;

public class Account {
    
    private String userName; 
    private String userPw;  
    private int cash;    

    public Account (String userName, String userPw, int cash) {
        this.userName = userName;
        this.userPw = userPw;
        this.cash = cash;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName (String userName) {
        this.userName = userName;
    }


    public String getUserPw() {
        return userPw;
    }


    public void setUserPw (String userPw) {
        this.userPw = userPw;
    }


    public int getCash() {
        return cash;
    }


    public void setCash (int cash) {
        this.cash = cash;
    }

    public void cashIn (int amount) {  
        this.cash = cash + amount;
        System.out.println("New balance: " + cash);
    }

    public void cashOut (int amount) { 
        
        if(amount > cash) {
            System.out.println("You don't have not enough balance...");
            System.out.println("Your balance: " + cash);
        }

        else {
            cash = cash - amount;
            System.out.println("New balance: " + cash);
        }
    }
    
}
