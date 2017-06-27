package moritz.figuren;

public abstract class Figur {

	public abstract double flaeche();

	public String getName() {
		return getClass().getSimpleName();

	}
}
