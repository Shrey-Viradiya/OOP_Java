import java.util.Scanner;

class NegativeAmountException extends Exception{
    NegativeAmountException(String S){
        super(S);
    }
}

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String S){
        super(S);
    }
}

class LowBalanceException extends Exception{
    LowBalanceException(String S){
        super(S);
    }
}
class BankAccount {

    int accNo;
    String custName;
    String accType;
    float balance;
    
    BankAccount(int acc, String c, String a, float b) throws LowBalanceException, NegativeAmountException{
        accNo = acc;
        custName = c;
        accType = a;

        if(accType.equals("Savings") && b<= 1000){
            throw new LowBalanceException("Low Balance!");
        }
        if(accType.equals("Current") && b <= 5000){
            throw new LowBalanceException("Low Balance!");
        }
        if(b <=0) {
            balance = 0;
            throw new NegativeAmountException("Not valid amount.");
        } 
        balance = b;
    }

    void deposit(float amt) throws NegativeAmountException{
        if (amt <= 0){
            throw new NegativeAmountException("Not valid amount.");
        }
        balance += amt;
    }

    void withDraw(float amt)throws InsufficientFundsException, NegativeAmountException{     
        if(amt <=0) {
            throw new NegativeAmountException("Not valid amount.");
        }        
        if(accType.equals("Savings") && ((balance - amt) <= 1000)){
            throw new InsufficientFundsException("Withdraw action cancled because of insufficient funds.");
        }
        if(accType.equals("Current") && ((balance - amt) <= 5000)){
            throw new InsufficientFundsException("Withdraw action cancled because of insufficient funds.");
        }
        balance -= amt;
    }

    float getBalance() throws LowBalanceException{
        if(accType.equals("Savings") && balance<= 1000){
            throw new LowBalanceException("Low Balance! "  + balance);
        }
        if(accType.equals("Current") && balance <= 5000){
            throw new LowBalanceException("Low Balance! " + balance);
        }
        return balance;
    }
}

public class InnerBankAccount {
    public static void main(String[] args) {
        String accType, Name;
        float balance;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter Name of the Account Holder: ");
        Name = S.nextLine();

        System.out.println("Enter Type of the Account: ");
        accType = S.nextLine();

        BankAccount b;

        
        while(true){
        try {
            System.out.println("Enter Initial: ");
            balance = S.nextFloat();
            b = new BankAccount(1, Name, accType, balance);
            break;
        }catch (LowBalanceException | NegativeAmountException e) {
                System.out.println(e.getMessage());
            }
        }


        Exe:
        while(true){
        try { 
            System.out.println("Choices:\n1: Deposit\n2: Withdraw\n3: GetBalance\n4: Exit");
            int choice;

            choice = S.nextInt();

            switch(choice){
                case 1:
                    b.deposit(S.nextFloat());
                    break;
                case 2:
                    b.withDraw(S.nextFloat());
                    break;

                case 3:
                    System.out.println(b.getBalance());
                    break;

                case 4:
                    break Exe;
            }
        }
        catch (LowBalanceException | NegativeAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
    
}