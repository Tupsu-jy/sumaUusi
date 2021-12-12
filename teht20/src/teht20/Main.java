package teht20;

import java.util.ArrayList;
import java.util.Iterator;

public class Main{

	public static void main(String[] args) {
		IteratorTester qwe = new IteratorTester();
		qwe.init();
		new Thread(qwe).start();
		new Thread(qwe).start();
	}

}

/*
    20. Iterator:
a) Tutki kuinka Javan iteraattori käyttäytyy, jos yritetään iteroida kokoelmaa kahdella 
säikeellä yhtä aikaa, kun molemmilla on oma iterattori.

Kummatkin säikeet iteroivat koko kokoelman ihan oikein.

b) entä, jos säikeet käyttävät samaa iteraattoria vuorotellen?

Iteroidaan koko kokoelma tasan kerran.

c) Kuinka käy, jos kokoelmaan tehdään muutoksia iteroinnin läpikäynnin aikana.

java.util.ConcurrentModificationException tapahtuu kun koittaa lisätä uusia elementtejä. Samoin
kun koittaa poistaa. 

d) Keksi jotain muuta testattavaa (esim. iteraattorin remove).

Kun poistaa elementtejä iteraattorin kautta niin kaikki toimii kauniisti vaikka olisi kaksi 
threadia käymässä läpi kokoelmaa samaan aikaan.


*/