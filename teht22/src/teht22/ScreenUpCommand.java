package teht22;

public class ScreenUpCommand implements Command {
	
	private Screen scr;
	
	public ScreenUpCommand(Screen scr) {
		this.scr = scr;
	}
	
	public void execute() {
		scr.screenUp();
	}
}