package teht2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		Class c = null;
		VaatetehdasIF tehdas = null;
		Jasper jasper = Jasper.getInstance();

		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("tehdas.properties"));
		} catch (IOException e) {e.printStackTrace();}
		try{
			//luetaan toteuttava tehdas properties-tiedostosta
			c = Class.forName(properties.getProperty("tehdas"));
			tehdas = (VaatetehdasIF)c.getDeclaredConstructor().newInstance();
		} catch (Exception e) {e.printStackTrace();}

		jasper.pueVaatteet(tehdas);
		System.out.println(""+jasper.onPaalla());

	}
}

/**
2.	Abstract Factory: Jasper Java-koodaaja on koko opiskeluaikansa pukeutunut Adidas-merkkisiin 
vaatteisiin lippis ja kengät mukaan lukien. Kirjoita ohjelma, jossa Jasper pukee päällensä farmarit, 
t-paidan, lippiksen ja kengät. Tämän jälkeen Jasper luettelee ylpeänä, mitä hänellä on päällään 
(vaatekappaleet osaavat toString-metodeissaan kertoa kaiken oleellisen itsestään).

Valmistuttuaan insinööriksi Jasper siirtyy käyttämään yksinomaan Boss-tuotteita ja osaa edelleen kertoa, 
mitä hänellä on päällään.

Koodaa ohjelma siten, että Jasperiin ei tarvitse tehdä juuri muutoksia Adidas->Boss siirtymän takia, 
vaan ainoa muutos on tuoteperheen (tehtaan) vaihto. 

Bonus: Hyödynnä Java Reflection APIa tehtaan luonnissa. 
Tästä yksi piste lisää, jos palautus ajoissa. Myöhästyneitä palautuksia ei huomioida. 

Jawper luokka joka ajetaan mainista. Mainissa sille annetaan vaatetehdas. Jasper käyttää tehdasta
pukeutumiseen eli laittaa omiin luokkamuuttujiinsa arvot(vaatteet). Tämä tehdään katsomatta mikö tehdas käytössä.
Vaatteet ovat rajapintoja jasperille samoin kuin vaatetehdas. Jasper käyttää vain rajapintoja. Jasperissa on 
muuttujat kummallekkin.

Reflektio:
Elikkäs..... Meillä on properties tiedosto missä lukee kumpaa ohjelmaa käytetään. Siellä on yksi rivi. Ei
totetuteta siirtymää koodiin. Mainissa haetaan käytettävä vaatetehdas ja annetaan jasperille.

"Keskeisin ohjelmoijan kannalta on se, että ohjelmassa voidaan luoda ilmentymä luokasta, jonka nimi saadaan
selville vasta ohjelman ajon aikana."

Tässä malli:??
package javakoulu.luku14;
02 public class TehdasTesti {
03 public static void main(String[] args) {
04 Class c = null;
05 TehdasIF tehdas = null;
06
07 Properties properties = new Properties();
08 try {
09 properties.load(
10 new FileInputStream("tehdas.properties"));
11 } catch (IOException e) {e.printStackTrace();}
12 try{
13 //luetaan toteuttava tehdas properties-tiedostosta
14 c = Class.forName(properties.getProperty("tehdas"));
15 tehdas = (TehdasIF)c.getDeclaredConstructor().newInstance()
);
16 }catch (Exception e){e.printStackTrace();}
17
18 SankariIF sankari = tehdas.luoSankari();
19 SankaritarIF sankaritar = tehdas.luoSankaritar();
20 sankaritar.pyydaApua();
21 sankari.auta();
22 }
23 } 

*/