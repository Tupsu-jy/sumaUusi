package teht4;

import java.time.LocalTime;
import java.time.ZoneId;

public class ClockTimer extends Subject {
	// muuttujat …
	private LocalTime rightNow = LocalTime.now(ZoneId.systemDefault());
	
	public int getHour(){
		return rightNow.getHour();
	}
	
	public int getMinute(){
		return rightNow.getMinute();
	}
	
	public int getSecond(){
		return rightNow.getSecond();
	}

	private void tick(){
		notifyObservers();
	}

	public void beginningOfTimeItself() throws InterruptedException {
		
		LocalTime.now(ZoneId.systemDefault()).getHour();
		
		while(true) {
			Thread.sleep(100);
			LocalTime temp = LocalTime.now(ZoneId.systemDefault());
			if(getSecond() != temp.getSecond()) {
				rightNow = temp;
				tick();
			}
		}
	}
}