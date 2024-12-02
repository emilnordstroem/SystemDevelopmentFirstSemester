package kajsBiler.kunde;

import java.util.ArrayList;

public class Firma {
    private final String navn;
    private final Adresse adresse;
    private final ArrayList<Erhvervskunde> ansatte;

    public Firma (String navn, Adresse adresse){
        this.navn = navn;
        this.adresse = adresse;
        this.ansatte = new ArrayList<>();
    }

    public void addAnsat(Erhvervskunde erhvervskunde){
        if(!ansatte.contains(erhvervskunde)){
            ansatte.add(erhvervskunde);
        }
    }

    @Override
    public String toString(){
        return String.format("%s%nFirma adresse: %s",
                this.navn,
                this.adresse.toString()
        );
    }
}
