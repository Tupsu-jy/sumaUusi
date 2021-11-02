package teht3Uusi;

public abstract class LehtiKomponentti implements Laiteosa {

	private int hinta;
	
	@Override
	public void addLaiteosa(Laiteosa osa) {
		System.out.println("Tämä yhdistelmä ei toimi");
	}

	@Override
	public int getHinta() {
		return hinta;
	}

	protected void setHinta(int hinta) {
		this.hinta = hinta;
	}
}
