package opgave02;

public class KontoApp {
    public static void main(String[] args) {
        Konto nyKonto = new Konto("Opsparing", 1);

        nyKonto.indsaetBeloeb(1000);
        nyKonto.haevBeloeb(50);
        System.out.println(nyKonto.getStatus());
        nyKonto.lukKonto();
        nyKonto.haevBeloeb(1000);
        System.out.println(nyKonto.getSaldo());
        System.out.println(nyKonto.getStatus());
    }
}
