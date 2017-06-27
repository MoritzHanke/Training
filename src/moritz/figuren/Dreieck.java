package moritz.figuren;

public class Dreieck extends Figur implements Eckig {

	Punkt p1, p2, p3;

	public Dreieck(Punkt p1, Punkt p2, Punkt p3) {
		assert p1.getY() == p2.getY();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;

	}

	@Override
	public double flaeche() {
		return Math.abs((p2.getX() - p1.getX()) * (p3.getY() - p1.getY()));
	}

	@Override
	public int getEckenAnzahl() {
		return 3;
	}

}
