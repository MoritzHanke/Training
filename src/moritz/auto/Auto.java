package moritz.auto;

public class Auto {

	private int anzahlRaeder;
	private String farbe;
	private double tankFuellung;

	//constructor erzeugt ein Objekt der Klasse
	public Auto() {
		this.anzahlRaeder = 4;
		this.farbe = "Blau";
		this.tankFuellung = 1.0;
		//this(4, "blau", 1.0);
	}

	//constructor mit Parametern
	public Auto(int anzahlRaeder, String farbe, double tankFuellung) {
		this.anzahlRaeder = anzahlRaeder;
		this.farbe = farbe;
		this.tankFuellung = tankFuellung;
	}

	public String getFarbe() {
		return this.farbe;
	}

	public void setFarbe(String farbe) {
		if (farbe != null && farbe.equals("Blau-Weiﬂ")) {
			throw new IllegalColorException();
		}

		this.farbe = farbe;
	}

	public void starten() {
		System.out.println(systemCheck());
		System.out.println(motorZuenden());
		System.out.println(losfahren());
	}

	String systemCheck() {
		return "Auto OK";
	}

	String motorZuenden() {
		return "Motor Klick (Auto.motorZuenden)";
	}

	String losfahren() {
		return "ich fahre los (Auto.losfahren)";
	}

	@Override
	public String toString() {
		return "Auto [anzahlRaeder=" + anzahlRaeder + ", farbe=" + farbe + ", tankFuellung=" + tankFuellung + "]";
	}

	public String toExtraLangerString() {
		return "hallo hallo hallo hallo";
	}
}
