package moritz.figuren;

public class Kreis extends Figur {

	double radius;
	Punkt mittelpunkt;

	public Kreis(double radius, Punkt mittelpunkt) {
		this.radius = radius;
		this.mittelpunkt = mittelpunkt;
	}

	public Kreis(double radius) {
		this(radius, new Punkt());
	}

	@Override
	public double flaeche() {
		return Math.PI * radius * radius;
	}

}
