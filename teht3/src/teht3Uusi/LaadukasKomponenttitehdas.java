package teht3Uusi;

public class LaadukasKomponenttitehdas implements KomponenttitehdasIF {

	@Override
	public Laiteosa ostaEmolevy() {
		return new LaatuEmolevy();
	}

	@Override
	public Laiteosa ostaKotelo() {
		return new LaatuKotelo();
	}

	@Override
	public Laiteosa ostaMuisti() {
		return new LaatuMuisti();
	}

	@Override
	public Laiteosa ostaNäytönohjain() {
		return new LaatuNäytönohjain();
	}

	@Override
	public Laiteosa ostaProsessori() {
		return new LaatuProsessori();
	}

}
