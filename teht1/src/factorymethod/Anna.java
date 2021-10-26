package factorymethod;

public class Anna extends AterioivaOtus {

	public String toString(){
        return "Anna";
    }

    public Juoma createJuoma(){
        return new Siideri();
    }

	public Ruoka createRuoka() {
		return new Ranet();
	};

}
