package teht4;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
	
	private Set<Observer> observers = new HashSet<Observer>();

	public void attach(Observer o){
		observers.add(o);
	}

	public void detach(Observer o) {
		observers.remove(o);
	}
	
	//"Cannot reduce the visibility of the inherited method from Object" jos 
	//koittaa käyttää pelkkää notify nimeä
	protected void notifyObservers(){
		for (Observer o: observers){
			o.update(this);
		}
	}
}