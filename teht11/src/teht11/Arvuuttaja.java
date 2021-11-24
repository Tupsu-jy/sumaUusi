package teht11;

public class Arvuuttaja {

	public Boolean arvaa(Object vast, int arvaus) {
		Memento temp = (Memento) vast;
		if(temp.oikeaVastaus==arvaus) {
			return true;
		}else {
			return false;
		}
	}
	
	public Object liityPeliin() {
		return new Memento();
	}
	
	private class Memento {
		int oikeaVastaus;
		
		public Memento() {
			oikeaVastaus = (int) (Math.random()*100);
		}
		
	}
}
