package kajsBiler.kunde;

public class Adresse {
    private final String vejnavn;
    private final String husnr;
    private final String postnr;

    public Adresse(String vejnavn, String husnr, String postnr){
        this.vejnavn = vejnavn;
        this.husnr = husnr;
        this.postnr = postnr;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s",
                this.vejnavn,
                this.husnr,
                this.postnr
        );
    }
}
