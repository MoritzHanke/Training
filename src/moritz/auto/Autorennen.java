package moritz.auto;

public class Autorennen {

	/*
	// EINFACHE TYPEN
	// Variablen einfacher typen enthalten nur werte, sonst nichts
	int zahl = 7;
	double kommazahl = 0.5;
	boolean geheim = true;
	char buchstabe = 'a';
	
	// KLASSEN
	// Klassen sind Typen, die Eigenschaften (Variablen) und Methoden enthalten
	// Objekte/Instanzen werden von Klassen erzeugt
	String text = "hallo world";
	Integer myInt = new Integer(7);
	Boolean myBool = Boolean.TRUE;
	*/

	private static final int autoAnzahl = 50;

	public void start() {

		Auto[] autos = { new Auto(), new Traktor("Landwirtschaftsgenossenschaft AG"), new PoliceCar() };

		autoRennenStarten(autos);

	}

	void autoRennenStarten(Auto[] autos) {
		for (int i = 0; i < autos.length; i++) {
			autos[i].starten();
		}
	}

	private void learnArrays() {
		Auto[] autos = new Auto[autoAnzahl];

		for (int i = 1; i <= autoAnzahl; i++) {
			//System.out.println(new Auto(i, "Bunt", 0.5));
			autos[i - 1] = new Auto(i, "Bunt", 0.5);
		}

		long index2 = Math.round((autoAnzahl - 1) * Math.random());
		do {
			System.out.println(autos[(int) index2]);
			index2 = Math.round((autoAnzahl + 2) * Math.random());
		} while (index2 < autos.length);

		System.out.println("-");
		long index = Math.round((autoAnzahl + 2) * Math.random());
		while (index < autos.length) {
			System.out.println(autos[(int) index]);
			index = Math.round((autoAnzahl + 2) * Math.random());
		}
	}
}
