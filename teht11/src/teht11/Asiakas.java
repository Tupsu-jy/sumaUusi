package teht11;

public class Asiakas {

	private Object vast;
	private Arvuuttaja arv;
	
	public Asiakas(Arvuuttaja init) {
		this.arv = init;
	}
	
	public Boolean arvaa() {
		return arv.arvaa(vast, (int) (Math.random()*100));
	}
	
	public void aloita() {

		Thread thread = new Thread(){
			public void run(){
				vast = arv.liityPeliin();
				while(!arvaa()) {
					System.out.println("Ei onnaa :(");
				}
				System.out.println("Onnas :D");
			}
		};

		thread.start();
	}
}
