package teht13Uusi;

public class Visitor implements VisitorIF {

	@Override
	public Pokemon evolveCheck(Pichu init) {
		if(init.bonuses.contains("<3")) {
			if(init.bonuses.contains("stone")) {
				return new Raichu();
			}
			return new Pikachu();
		}
		return init;
	}

	@Override
	public Pokemon evolveCheck(Pikachu init) {
		if(init.bonuses.contains("stone")) {
			return new Raichu();
		}
		return init;
	}

	@Override
	public Pokemon evolveCheck(Raichu init) {
		return init;
	}

}
