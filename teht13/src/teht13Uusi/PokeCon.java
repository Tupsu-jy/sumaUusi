package teht13Uusi;

public class PokeCon {

	private Pokemon state;
	private VisitorIF vis;
	
 	public PokeCon(Pokemon init) {
		state = init;
		vis = new Visitor();
	}
	
 	protected void changeState(Pokemon newState) {
 		state = newState;
 	}
 	
 	public void electricity() {
 		state.electricity();
 	}
 	
 	public void friendship() {
 		state.friendship(this);
 		if(state instanceof Pichu) {
 			state = vis.evolveCheck((Pichu) state);
 		}else if(state instanceof Pikachu) {
 			state = vis.evolveCheck((Pikachu) state);
 		}else{
 			state = vis.evolveCheck((Raichu) state);
 		}
 	}
 	
 	public void thunderStone() {
 		state.thunderStone(this);
 		if(state instanceof Pichu) {
 			state = vis.evolveCheck((Pichu) state);
 		}else if(state instanceof Pikachu) {
 			state = vis.evolveCheck((Pikachu) state);
 		}else{
 			state = vis.evolveCheck((Raichu) state);
 		}
 	}
}
