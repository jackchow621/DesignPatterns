package ghost.designpatterns.strategy.impl;

import ghost.designpatterns.strategy.Strategy;

public class StrategyA implements Strategy {

	public void algorithm(int value) {
		// TODO Auto-generated method stub
		System.out.println("strategyA's algorithm:" + value * 20);
	}

}
