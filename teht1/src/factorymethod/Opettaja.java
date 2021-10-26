package factorymethod;

public class Opettaja extends AterioivaOtus {

	public String toString(){
        return "Opettaja";
    }

    public Juoma createJuoma(){
        return new Vesi();
    };

    public Ruoka createRuoka(){
        return new Peruna();
    };

}
