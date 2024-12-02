import java.time.LocalDate;

public class Transaction {
    private int amount;
    private LocalDate date;

    public Transaction(int amount){
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public int getAmount() {
        return amount;
    }
}
