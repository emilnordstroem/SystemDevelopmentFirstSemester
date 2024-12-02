package Controller;

import Model.Konto;
import Model.KontoType;
import Model.Tilstand;
import Storage.Storage;

public class Controller {

	public static KontoType createKontoType(String navn, String beskrivelse) {

		KontoType kontoType = new KontoType(navn, beskrivelse);
		Storage.addKontoType(kontoType);
		return kontoType;
	}

	public static Konto createKonto(KontoType kontoType, int overtrækLoft) {
		int nr = Storage.getKonti().size()+1;
		Konto konto = new Konto(kontoType,nr,overtrækLoft);
		Storage.addKonto(konto);

		return konto;
	}

	public static void foretagTransaktion(Konto konto, int beløb) {
		try {
			konto.createTransaktion(beløb);
			// Hvis kontoens saldo er overtrukket med mere end -15.000 DKK, spærres konto
			if(konto.beregnSaldo() < konto.getOvertrækLoft()){
				konto.spærKonto();
			}
		} catch (RuntimeException exception) {
			System.out.println(exception.getMessage());
		}
	}

	// Lukning af konto
	public static void lukKonto(Konto konto){
		if(!konto.getTilstand().equals(Tilstand.OVERTRUKKET)){
			konto.lukKonto();
		}
	}

}
