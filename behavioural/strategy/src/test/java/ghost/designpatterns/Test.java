package ghost.designpatterns;

import ghost.designpatterns.strategy.Context;
import ghost.designpatterns.strategy.Strategy;
import ghost.designpatterns.strategy.impl.StrategyA;
import ghost.designpatterns.strategy.impl.StrategyB;

public class Test{
	public static void main(String[] args) {
		Context context = new Context(1);
		Strategy strategyA = new StrategyA();
		Strategy strategyB = new StrategyB();
		
		context.setAlgorithm(strategyA);
		context.run();
		
		context.setAlgorithm(strategyB);
		context.run();
	}
}