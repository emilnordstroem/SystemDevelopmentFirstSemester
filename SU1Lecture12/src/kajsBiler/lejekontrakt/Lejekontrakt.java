package kajsBiler.lejekontrakt;

import java.time.LocalDate;
import java.util.Random;

public class Lejekontrakt {
    private final String kontraktnr;
    private final LocalDate konDato;

    private Reservation reservation;
    private Udlejning udlejning;

    public Lejekontrakt(){
        this.kontraktnr = konstraktnrGenerator();
        this.konDato = LocalDate.now();
    }

    public void opretReservation(String forventedeUdlPeriode){
        this.reservation = new Reservation(forventedeUdlPeriode);
    }

    public void opretUdlejning(String aktuelUdlPeriode, Double depositum, int startkm){
        this.udlejning = new Udlejning(aktuelUdlPeriode, depositum, startkm);
    }

    public String getKontraktnr() {
        return kontraktnr;
    }

    private String konstraktnrGenerator(){
        Random kontraktnr = new Random();
        return Integer.toString(kontraktnr.nextInt(111111, 999999));
    }
}
