import java.util.ArrayList;
import java.util.Random;

public class Account {
    private int accountId;
    private String AccountType;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    // Unsure rather it's necessary to construct the data field
    private int balance;

    public Account(AccountType accountType){
        this.accountId = generateAccountID();
        this.AccountType = accountType.getAccountType();
        this.balance = 0;
    }

    public int calculateBalance(){
        int balance = 0;
        for(Transaction transaction : transactions){
            balance += transaction.getAmount();
        }
        setBalance(balance);
        return balance;
    }

    public int depositAmount(int amount){
        Transaction transaction = new Transaction(amount);
        this.transactions.add(transaction);
        return calculateBalance();
    }

    private int generateAccountID(){
        Random generator = new Random();
        return generator.nextInt(100) + 1;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return String.format("%s %d\n%s %d\n%s", "Account id:", accountId, "Balance:", balance, AccountType);
    }
}
