package teht3Uusi;

public class Main {

	public static void main(String[] args) {
		
		//KomponenttitehdasIF tehdas = new TavallinenKomponenttitehdas();
		KomponenttitehdasIF tehdas = new LaadukasKomponenttitehdas();

		Laiteosa emolevy = tehdas.ostaEmolevy();
		emolevy.addLaiteosa(tehdas.ostaMuisti());
		emolevy.addLaiteosa(tehdas.ostaNäytönohjain());
		emolevy.addLaiteosa(tehdas.ostaProsessori());
		Laiteosa kotelo = tehdas.ostaKotelo();
		kotelo.addLaiteosa(emolevy);
		System.out.println(kotelo.getHinta()+" euroa");
	}

}

/**
Laiteosa rajapinta vai abstrakti?
rajapinta: kaikki metodit paitsi konstruktori määritellään rajapinnassa. Paljon toistoa ja konstruktori jää
määrittelemättä.
abstrakti: konstruktori määritellään rajapinnassa. 

tehdään rajapinta ja sen alle kaksi abstraktia luokkaa. Lehti ja komposiittiluokka

Laiteosa rajapinnassa on kaikki metodit mitä koostekompo tarvii. Lehtikompo myös toteuttaa rajapinnan vaikka
kaikille metodeille ei ole käyttöä. 
Komponentit on toteutuksia ei rajapintoja missään määrin

Rajapinta sisältää getHinta()
lehti vain palauttaa hinnan, mutta kooste kutsuu metodia kaikista lapsistaan myös.

Abstrakti tehdas tuottaa komponentit?

3.	Composite: Suunnittele Composite-mallin mukaisesti rajapinnat ja toteutukset systeemille, jolla
 voit esittää pöytätietokoneen kokoonpanon ja laskea sen hinnan, kun kukin komponentti tietää oman hintansa.

Idea on että tietokoneen kaikki osat ovat vaikkapa Laiteosa-rajapinnan toteuttajia. Laiteosalla on hinta.

Laiteosia on erilaisia, esim:
- muistipiiri
- emolevy
- prosessori
- verkkokortti
- näytönohjain
- kotelo

Näistä ainakin emolevy ja kotelo ovat koostekomponentteja. Näiden hinta muodostuu komponentin omasta 
hinnasta sekä mahdollisen sisällön eli liitettyjen komponenttien hinnasta.

Esitä luokkahierarkia ja rakenna pöytätietokonekokoonpano haluamistasi osista ja laske lopuksi kokoonpanon
 hinta ja tulosta se. Hinnan ilmoittava metodi palauttaa hinnan metodin paluuarvona.

Hyvän mielen bonus:

Esitä, kuinka voit luoda kaikki tuoteosat abstraktin tehtaan avulla.
Esitä myös, kuinka konkreettista tehdasta vaihtamalla saat helposti lasketuksi eri tehtaiden
 tuottamien samanlaisten kokoonpanojen hintoja.

*/