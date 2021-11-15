package teht7Uusi;

public class PokeCon {

	private Pokemon state;
	
 	public PokeCon(Pokemon init) {
		state = init;
	}
	
 	protected void changeState(Pokemon newState) {
 		state = newState;
 	}
 	
 	public void electricity() {
 		state.electricity();
 	}
 	
 	public void friendship() {
 		state.friendship(this);
 	}
 	
 	public void thunderStone() {
 		state.thunderStone(this);
 	}
}
