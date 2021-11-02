package teht2;

public class Jasper {
	
	private HousutIF housut;
	private KengatIF kengat;
	private PaitaIF paita;
	private static Jasper instance;

	private Jasper() {};

	public static Jasper getInstance() {
		if(instance == null) {
			return new Jasper();
		}
		
		return instance;
	}

	public void pueVaatteet(VaatetehdasIF tehdas) {
		housut = tehdas.luoHousut();
		kengat = tehdas.luoKengat();
		paita = tehdas.luoPaita();
	}
	
	public String onPaalla() {
		return "Minulla on päällä "+housut.toString()+", "+kengat.toString()+", "+paita.toString();
	}
}
