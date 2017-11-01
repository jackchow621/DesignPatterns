package ghost.designpatterns.strategy;

public class Context {
	private int value;
	private Strategy strategy;
	public Context(int value) {
		this.value = value;
	}
	
	public void setAlgorithm(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void run(){
		this.strategy.algorithm(value);
	}
}
