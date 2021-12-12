package teht20;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTester implements Runnable {

	ArrayList<Integer> test;
	Iterator<Integer> asd;

	public void init() {
	    test = new ArrayList<Integer>();
	    for (int i = 1; i < 100; i++) {
			test.add(i);
		}
	    asd = test.iterator();

	}
	
	@Override
	public void run() {
		for (Iterator iterator = asd; iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			iterator.remove();
			System.out.println(integer);
		}
	}
	
}
