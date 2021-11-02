package teht2;

public class AdidasVaatetehdas implements VaatetehdasIF {

	public HousutIF luoHousut() {
		return new AdidasHousut();
	}

	public PaitaIF luoPaita() {
		return new AdidasPaita();
	}

	public KengatIF luoKengat() {
		return new AdidasKengat();
	}
}
