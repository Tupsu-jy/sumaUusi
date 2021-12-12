package teht13Uusi;

public class Pichu extends Pokemon {

	@Override
	public void electricity() {
		System.out.println("zap");
	}

	@Override
	public void friendship(PokeCon context) {
		System.out.println("Evolveing!!!");
		bonuses.add("<3");
	}

	@Override
	public void thunderStone(PokeCon context) {
		System.out.println("Nice stone!");
		bonuses.add("stone");
	}

}
