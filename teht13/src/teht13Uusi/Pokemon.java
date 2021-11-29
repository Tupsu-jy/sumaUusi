package teht13Uusi;

import java.util.HashSet;

public abstract class Pokemon {

	public HashSet<String> bonuses = new HashSet<String>();
	
	public abstract void electricity();
	public abstract void friendship(PokeCon context);
	public abstract void thunderStone(PokeCon context);
}
