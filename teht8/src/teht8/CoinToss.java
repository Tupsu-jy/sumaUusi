package teht8;

import java.util.Stack;

public class CoinToss extends Game {

	Stack<Integer> stack;
	
	@Override
	void initializeGame() {
		stack = new Stack<Integer>();
	}

	@Override
	void makePlay(int player) {
		if(Math.round(Math.random())==1) {
			stack.push(player);
		}
	}

	@Override
	boolean endOfGame() {
		if(stack.size()>=playersCount) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("VOITTAJA ON PELAAJA "+stack.pop()+"!!!!");
	}

}
