package factorymethod;

public class Samuli extends AterioivaOtus {

	public String toString(){
        return "Samuli";
    }

    public Juoma createJuoma(){
        return new Kalja();
    };

    public Ruoka createRuoka(){
        return new Olut();
    };

}
