package kajsBiler.bil;

public class Bil {
    private final String regnr;
    private final String maerke;
    private final String model;
    private String status;

    public Bil(String regnr, String maerke, String model){
        this.regnr = regnr;
        this.maerke = maerke;
        this.model = model;
        this.status = "Ledig";
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString(){
        return String.format("Reg nr.: %s%nMærke: %s%nModel: %s",
                this.regnr,
                this.maerke,
                this.model);
    }
}
