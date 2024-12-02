package kajsBiler.kunde;

public class Privatkunde extends Kunde{
    private final String cprNr;

    public Privatkunde(String name, Adresse adresse, String koerkortnr, String telefonnr, String cprNr){
        super(name, adresse, koerkortnr, telefonnr);
        this.cprNr = cprNr;
    };

    @Override
    public String toString() {
        return String.format("%s%nCpr-nr.: %s",
                super.toString(),
                this.cprNr
        );
    }
}
