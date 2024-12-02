package kajsBiler.kunde;

public class Erhvervskunde extends Kunde{
    private String konto;
    private Firma firma;

    public Erhvervskunde(String name, Adresse adresse, String koerkortnr, String telefonnr, String konto, Firma firma){
        super(name, adresse, koerkortnr, telefonnr);
        this.konto = konto;
        this.firma = firma;
    }

    public String getKonto() {
        return konto;
    }

    public Firma getFirma() {
        return firma;
    }

    @Override
    public String toString() {
        return String.format("%s%nKonto: %s%n%s",
                super.toString(),
                this.konto,
                this.firma.toString());
    }
}
