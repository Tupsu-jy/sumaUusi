package teht11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arvuuttaja test = new Arvuuttaja();
		
		for (int i = 0; i < 10; i++) {
			new Asiakas(test).aloita();
		}
	}

}

/*

Memento: Arvuuttajalla on useita asiakkaita (säikeitä), joita kutakin varten se arpoo 
luvun, jota asiakas yrittää arvata toistuvasti. Peli käynnistyy siten, että asiakas 
ilmoittautuu peliin mukaan Arvuuttajan liityPeliin()-metodilla (asiakas välittää itsensä 
parametrina), Metodissa arvuuttaja arpoo luvun ja tallentaa sen. 

Perinteinen tapa toteuttaa Arvuuttaja, on määritellä siihen HashMap, jossa säilytetään
asiakaskohtaiset tiedot (key = asiakas, value=luku). Arvatessaan lukua asiakas välittää 
arvaus()-kutsussa parametrina itsensä ja arvauksensa. Paluuarvona on true tai false.

Mementoa käytettäessä HashMap-ratkaisua ei tarvita eikä asiakkaan viitteen välittämistä
arvuuttajalle. Arvuuttaja palauttaa liityPeliin()-metodissa asiakkaalle Mementon, jossa 
on arvottu luku, joten  Arvuuttajan ei sitä tarvitse muistaa. Huomaa, että asiakas ei saa
päästä lukuun käsiksi! Jokaisen arvauksensa yhteydessä asiakas välittää Arvuuttajalle
Mementon, jossa olevaa lukua Arvuuttaja vertaa uuteen arvaukseen ja kertoo, kuinka kävi.
Peli päättyy, kun kaikki säikeet ovat arvanneet oikein.
Toteuta ohjelma Javalla.


aasiakas luokka <- caretaker
sisältää memento olion jossa oikea vastaus. aasiakas ei pääse siihen käsiksi<-miten ei pääse?? sisäluokka ehkä 

arvuuttaja luokka <-- origanotar?
liitypeliin() palauttaa mementon asiakkaalle
arvaus(mememto, arvaus)

caretaker viel erikseen?? vai onko tää aasiakas?
*/