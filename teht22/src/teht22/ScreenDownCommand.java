package teht22;

public class ScreenDownCommand implements Command {
	
	private Screen scr;
	
	public ScreenDownCommand(Screen scr) {
		this.scr = scr;
	}
	
	public void execute() {
		scr.screenDown();
	}
}