package teht22;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen scr = new Screen();
		Command switchUp = new ScreenUpCommand(scr);
		Command switchDown = new ScreenDownCommand(scr);
		Button button1 = new Button(switchUp);
		Button button2 = new Button(switchDown);
		button1.push();
		button2.push();
		
		button2.push();
		button1.push();
	}

}

/*
Command: Toteuta Command.pdf:n esimerkkiä mukaillen sovellus, 
jossa mallinnetaan kaksi seinäpainiketta: ”valkokangas ylös”, ”valkokangas alas”.
*/