package Model;

import Controller.Controller;

public class TilstandeTest {

	public static void main(String[] args) {

		KontoType kontotype = Controller
				.createKontoType(
						"Ungdomskonto",
						"En kontotype til unge under 25, som for at beskytte du unge ikke tillader at der hæves på en konto med saldo under 0");
		// Loft for overtræk
		int overtrækLoft = -15000;

		Konto k1 = Controller.createKonto(kontotype, overtrækLoft);

		Controller.foretagTransaktion(k1, 100);
		Controller.foretagTransaktion(k1, 200);
		Controller.foretagTransaktion(k1, -400);

		//Controller.foretagTransaktion(k1, -200); // giver exception

		System.out.println(k1);
		Controller.foretagTransaktion(k1, 100);

		// Spærring af konto
		Controller.foretagTransaktion(k1,-20000);
		System.out.println(k1.getTilstand());

		// Printer tilstand
		System.out.println(k1.getTilstand());
		// Bør ikke lukke konto - konto er i overtræk
		Controller.lukKonto(k1);
		System.out.println(k1.getTilstand());
		// Indsætter belæb
		Controller.foretagTransaktion(k1, 100);
		System.out.println(k1);
		// Konto bør lukke
		Controller.lukKonto(k1);
		System.out.println(k1.getTilstand());



	}
}
