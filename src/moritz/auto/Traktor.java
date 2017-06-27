package moritz.auto;

public class Traktor extends Auto {

	String firma;

	public Traktor(String firma) {
		this.firma = firma;
	}

	public String getFirma() {
		return this.firma;
	}

	@Override
	public String losfahren() {
		return super.losfahren() + ", aber ich tucker (Traktor.losfahren)";
	}

	@Override
	String systemCheck() {
		return "Traktor OK";
	}
}
