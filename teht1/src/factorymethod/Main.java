package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        AterioivaOtus samuli = new Samuli();
        samuli.aterioi();
        AterioivaOtus anna = new Anna();
        anna.aterioi();
    }
}

/**
Esimerkkiohjelman Juoma luodaan AterioivanOtuksen 
Opettaja-aliluokassa. Juomanluontimetodi on tehdasmetodi. Kirjoita Opettaja-luokalle kaksi 
rinnakkaista luokkaa, joissa kummassakin luodaan sopiva juoma.

Luo testiohjelmassasi jokaista otustyyppiä oleva olio ja laita ne aterioimaan. 
(Voit halutessasi laajentaa ohjelmaa ottamalla mukaan Ruoka-rajapinnan.)

*/