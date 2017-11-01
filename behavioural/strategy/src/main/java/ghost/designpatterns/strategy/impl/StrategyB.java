package ghost.designpatterns.strategy.impl;

import ghost.designpatterns.strategy.Strategy;

public class StrategyB implements Strategy {

	public void algorithm(int value) {
		// TODO Auto-generated method stub
		System.out.println("strategyB's algorithm:" + value * 10);
	}

}
