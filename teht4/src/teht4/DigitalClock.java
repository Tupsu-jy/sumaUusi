package teht4;

public class DigitalClock implements Observer {

	private ClockTimer timer;

	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.attach(this);
	}

	@Override
	public void update(Subject s) {
		if (s == timer){
			draw();
		}
	}

	private void draw(){
		System.out.println((timer.getHour()<10 ? "0"+timer.getHour() : timer.getHour())+":"
				+(timer.getMinute()<10 ? "0"+timer.getMinute() : timer.getMinute())
				+":"+(timer.getSecond()<10 ? "0"+timer.getSecond() : timer.getSecond()));
	}
}