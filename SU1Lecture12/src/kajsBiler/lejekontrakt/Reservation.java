package kajsBiler.lejekontrakt;

import java.time.LocalDate;

public class Reservation {
    protected LocalDate dato;
    protected String forventedeUdlPeriode;

    public Reservation(String forventedeUdlPeriode){
        this.dato = LocalDate.now();
        this.forventedeUdlPeriode = forventedeUdlPeriode;
    }

    public LocalDate getDato(){
        return dato;
    }
    public String getForventedeUdlPeriode(){
        return forventedeUdlPeriode;
    }

    public void setDato(LocalDate dato){
        this.dato = dato;
    }
    public void setForventedeUdlPeriode(String forventedeUdlPeriode){
        this.forventedeUdlPeriode = forventedeUdlPeriode;
    }
}
