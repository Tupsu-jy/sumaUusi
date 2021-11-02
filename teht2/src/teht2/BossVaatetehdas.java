package teht2;

public class BossVaatetehdas implements VaatetehdasIF {

	public HousutIF luoHousut() {
		return new BossHousut();
	}

	public PaitaIF luoPaita() {
		return new BossPaita();
	}

	public KengatIF luoKengat() {
		return new BossKengat();
	}
}
