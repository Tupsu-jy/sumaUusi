package teht13Uusi;

public class Main {

	public static void main(String[] args) {
		PokeCon test = new PokeCon(new Pichu());

		for (int i = 0; i < 3; i++) {
			test.electricity();
			if(i==0) {
				test.thunderStone();
				test.friendship();
			} else {
				test.friendship();
				test.thunderStone();
			}
		}
	}

}

/**

mainissa ajetaan eri metodeja

konteksti: nimetään PokeCon
oikea luokka. Sisältää pokemon staten. Pelkkä yhteysluokka. Ohjaa vain pyynnöt statelle

state: nimetään Pokemon
rajapinta. 

pichu, 

pikachu, 

raichu

kaikki toteuttaa Pokemon rajapinnan
siellä on metodeja:
electricity. sout(zap!!)
friendship. pichu evolve. muut sout(<3)
thunderStone pikachu evolve. muut sout(its a stone :/)

7.	State: Määrittele pelihahmo ja sille kolme kehitysastetta. Toteuta eri 
kehitysasteet State-mallin mukaisesti. Pelihahmo voisi olla esim. Pokemon-hahmo 
Charmander, jonka kaksi muuta kehitysastetta ovat Charmeleon ja Charizard. 
Määrittele pelihahmolle vähintään kolme erilaista toimintoa (metodia) siten, 
että käyttäytyminen riippuu pelihahmon tilasta. Tilanvaihtojen pitää toteutua 
automaattisesti ”pinnan  alla”. Pääohjelma (client) ei siis vaihda Pokemonin tilaa. 
Pääohjelmassa Pokemon tekee esim. luupissa  temppuja, joiden  seurauksena tila aina 
jossain vaiheessa vaihtuu. Kirjoita sopivia tulostuksia, jotta tilanvaihdot havaitaan.
*/