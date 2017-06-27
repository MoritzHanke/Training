package moritz.figuren;

import java.util.ArrayList;
import java.util.List;

public class FigurenVerzeichnis {

	public static void start() {

		List<Figur> liste = new ArrayList<>();

		liste.add(new Kreis(3.5));
		liste.add(new Rechteck(6.0, 3.5));
		liste.add(new Rechteck(3.6, 1.5));
		liste.add(new Dreieck(new Punkt(1, 1), new Punkt(4, 1), new Punkt(5, 6)));

		double f = 0;
		int eckenGesamt = 0;

		for (Figur figur : liste) {
			f += figur.flaeche();
			int ecken = 0;
			if (figur instanceof Eckig) {
				Eckig e = (Eckig) figur;
				eckenGesamt += e.getEckenAnzahl();
				ecken = e.getEckenAnzahl();
			}

			//todo in Figur.toString auslagern
			System.out.println(figur.getName() + ":" + figur.flaeche() + "    Ecken:" + ecken);
		}

		System.out.println("---------------------");
		System.out.println("Gesamtfläche:" + f);
		System.out.println("Ecken(gesamt):" + eckenGesamt);

	}

}
