package teht7Uusi;

public class Pikachu implements Pokemon {

	@Override
	public void electricity() {
		System.out.println("ZAP!!");
	}

	@Override
	public void friendship(PokeCon context) {
		System.out.println("ihQ!!! <3 <3 <3");
	}

	@Override
	public void thunderStone(PokeCon context) {
		System.out.println("Evolveing!!!");
		context.changeState(new Raichu());
	}

}
