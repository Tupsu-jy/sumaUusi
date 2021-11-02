package teht3Uusi;

public class TavallinenKomponenttitehdas implements KomponenttitehdasIF {

	@Override
	public Laiteosa ostaEmolevy() {
		return new Emolevy();
	}

	@Override
	public Laiteosa ostaKotelo() {
		return new Kotelo();
	}

	@Override
	public Laiteosa ostaMuisti() {
		return new Muisti();
	}

	@Override
	public Laiteosa ostaNäytönohjain() {
		return new Näytönohjain();
	}

	@Override
	public Laiteosa ostaProsessori() {
		return new Prosessori();
	}

}
