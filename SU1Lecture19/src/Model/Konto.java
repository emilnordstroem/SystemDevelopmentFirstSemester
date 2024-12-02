package Model;

import java.util.ArrayList;

public class Konto {

	private int nr;

	private ArrayList<Transaktion> transaktioner;

	private KontoType kontoType;

	private Tilstand tilstand;

	private int overtrækLoft;

	public Konto(KontoType kontoType, int nr, int overtrækLoft) {
		this.kontoType = kontoType;
		this.nr = nr;
		this.tilstand = Tilstand.AABEN;
		transaktioner = new ArrayList<Transaktion>();
		this.overtrækLoft = overtrækLoft;
	}

	public int getNr() {
		return this.nr;
	}

	public Tilstand getTilstand() {
		return tilstand;
	}

	public int getOvertrækLoft() {
		return overtrækLoft;
	}

	public void setTilstand(Tilstand tilstand) {
		this.tilstand = tilstand;
	}

	public Transaktion createTransaktion(int beløb) {
		Transaktion transaktion = null;
		if (!(tilstand == Tilstand.OVERTRUKKET && beløb < 0)) {
			transaktion = new Transaktion(beløb);
			transaktioner.add(transaktion);
			if (beregnSaldo() < 0) {
				tilstand = Tilstand.OVERTRUKKET;
			} else {
				tilstand = Tilstand.AABEN;
			}
		} else
			throw new RuntimeException("Du forsøger at hæve på en overtrukket konto!");

		return transaktion;
	}

	public int beregnSaldo() {
		int saldo = 0;
		for (Transaktion transaktion : transaktioner) {
			saldo += transaktion.getBeløb();
		}
		return saldo;
	}

	// Spærring af konto
	public void spærKonto(){
		setTilstand(Tilstand.SPAERRET);
	}

	// lukning af konto
	public void lukKonto(){
		setTilstand(Tilstand.LUKKET);
	}

	@Override
	public String toString() {
		return "Saldo på konto nr. " + getNr() + " med kontotype: "+ kontoType.getNavn()+ " er " + beregnSaldo();
	}
}
