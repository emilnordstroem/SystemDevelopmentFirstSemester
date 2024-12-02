package kajsBiler.lejekontrakt;

public class Udlejning {
    protected String aktuelUdlPeriode;
    protected double depositum;
    protected int kmStart;
    protected int kmSlut;

    public Udlejning(String aktuelUdlPeriode, double depositum, int kmStart){
        this.aktuelUdlPeriode = aktuelUdlPeriode;
        this.depositum = depositum;
        this.kmStart = kmStart;
    }

    public int udregnKmForbrug(int kmSlut){
        return (kmSlut - kmStart);
    }
}
