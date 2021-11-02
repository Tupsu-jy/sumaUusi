package teht3Uusi;

import java.util.HashSet;
import java.util.Set;

public abstract class KomposiittiKomponentti implements Laiteosa {

	private int hinta;
	private Set<Laiteosa> lapset;

	public KomposiittiKomponentti() {
		lapset = new HashSet<>();
	}
	
	@Override
	public void addLaiteosa(Laiteosa osa) {
		lapset.add(osa);
	}

	@Override
	public int getHinta() {
		int yhteishinta = hinta;
		
		for (Laiteosa laiteosa : lapset) {
			yhteishinta += laiteosa.getHinta();
		}
		
		return yhteishinta;
	}

	protected void setHinta(int hinta) {
		this.hinta = hinta;
	}
}
