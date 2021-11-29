package teht13Uusi;

public class Pikachu extends Pokemon {

	@Override
	public void electricity() {
		System.out.println("ZAP!!");
	}

	@Override
	public void friendship(PokeCon context) {
		System.out.println("ihQ!!! <3 <3 <3");
		bonuses.add("<3");
	}

	@Override
	public void thunderStone(PokeCon context) {
		System.out.println("Evolveing!!!");
		bonuses.add("stone");
	}

}
