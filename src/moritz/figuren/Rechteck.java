package moritz.figuren;

public class Rechteck extends Figur implements Eckig {

	Punkt linksOben;
	double breite;
	double hoehe;

	public Rechteck(Punkt linksOben, double breite, double hoehe) {
		this.linksOben = linksOben;
		this.breite = breite;
		this.hoehe = hoehe;

	}

	public Rechteck(double breite, double hoehe) {
		this(new Punkt(), breite, hoehe);
	}

	@Override
	public double flaeche() {
		return breite * hoehe;
	}

	@Override
	public int getEckenAnzahl() {
		return 4;
	}

}
