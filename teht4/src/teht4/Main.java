package teht4;

public class Main {

	public static void main(String[] args) {
		ClockTimer s = new ClockTimer();
		s.attach(new DigitalClock(s));
		
		try {
			s.beginningOfTimeItself();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
/**
Observer: Toteuta luentomateriaalissa (Observer.pdf) Observer-mallin sovelluksena 
esitetty hahmotelma digitaalisesta kellosta Javalla täydentäen koodia puuttuvin osin. 
Käytä ratkaisussasi Javan APIsta löytyviä Observer-rajapintaa ja Observable-luokkaa. 
Jos haluat käyttää jotain muuta Javan APIsta löytyvää tekniikkaa, koska Observer/Observable on
deprecated Java 9:stä alkaen, se on ok. Vaikka Javan Observer/Observable-mekanismi on deprecated, 
sitä ei poisteta Javasta, mutta sen kehitystä ei jatketa. Sen käytölle on esitetty vaihtoehtoisia tapoja.
*/