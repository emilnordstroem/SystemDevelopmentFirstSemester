package kajsBiler.kunde;

import kajsBiler.lejekontrakt.Lejekontrakt;

import java.util.ArrayList;

public class Kunde {
    private final String name;
    private Adresse adresse;
    private String koerekortnr;
    private String telefonnr;
    private final ArrayList<Lejekontrakt> lejekontraktArrayList;

    public Kunde(String name, Adresse adresse, String koerekortnr, String telefonnr){
        this.name = name;
        this.adresse = adresse;
        this.koerekortnr = koerekortnr;
        this.telefonnr = telefonnr;
        this.lejekontraktArrayList = new ArrayList<>();
    }

    public void addLejekontrakt(Lejekontrakt lejekontrakt){
        if(!lejekontraktArrayList.contains(lejekontrakt)){
            lejekontraktArrayList.add(lejekontrakt);
        }
    }

    public String toString(){
        return String.format("Navn: %s%nAdresse: %s%nKørekortnr.: %s%nTelefonnr.: %s",
                this.name,
                this.adresse.toString(),
                this.koerekortnr,
                this.telefonnr
        );
    }
}
