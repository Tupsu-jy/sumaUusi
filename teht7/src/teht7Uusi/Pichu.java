package teht7Uusi;

public class Pichu implements Pokemon {

	@Override
	public void electricity() {
		System.out.println("zap");
	}

	@Override
	public void friendship(PokeCon context) {
		System.out.println("Evolveing!!!");
		context.changeState(new Pikachu());
	}

	@Override
	public void thunderStone(PokeCon context) {
		System.out.println("Nice stone!");
	}

}
