package opgave02;

public class Konto {
    private final int nr;
    private int saldo;
    private final String kontoType;
    private String status;

    // Constructor method for account
    Konto(String kontoType, int nr){
        this.kontoType = kontoType;
        this.nr = nr;
        setSaldo(0);
        setStatus("Åben");
    }

    // Setter methods
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    // Getter methods
    public int getSaldo() {
        return saldo;
    }
    public String getStatus() {
        return status;
    }

    // Methods for inserting, removing, and closing
    public void indsaetBeloeb(int beloeb){
        if(getStatus().equals("Åben")){
            int previousSaldo = getSaldo();
            int newSaldo = previousSaldo + beloeb;
            setSaldo(newSaldo);
        }
    }
    public void haevBeloeb(int beloeb){
        if(getStatus().equals("Åben")){
            int previousSaldo = getSaldo();
            int newSaldo = previousSaldo - beloeb;
            setSaldo(newSaldo);
        }
    }
    // method for closing account
    public void lukKonto(){
        this.status = "Spærret/Lukket";
    }

}