package kajsBiler.bil;

import java.util.ArrayList;

public class Prisgruppe {
    private final char gruppe;
    private double prisPrDag;
    private double prisPrTime;
    private double prisPrKm;
    private final ArrayList<Bil> prisgruppeliste = new ArrayList<>();

    public Prisgruppe(char gruppe, double prisPrDag){
        this.gruppe = gruppe;
        this.prisPrDag = prisPrDag;
        this.prisPrTime = udregnPrisPrTime(prisPrDag);
    }

    private double udregnPrisPrTime(double prisPrDag){
        return prisPrDag / 24;
    }

    public void checkLedige(){
        ArrayList<Bil> ledigeBiler = new ArrayList<>();
        for(Bil bil : prisgruppeliste){
            if(bil.getStatus().equals("Ledig")){
                ledigeBiler.add(bil);
                System.out.println(bil.toString());
            }
        }
    }

    public ArrayList<Bil> addBil(Bil bil){
        ArrayList<Bil> bilArrayList = new ArrayList<>(prisgruppeliste);
        if(!bilArrayList.contains(bil)){
            bilArrayList.add(bil);
        }
        return bilArrayList;
    }

}
