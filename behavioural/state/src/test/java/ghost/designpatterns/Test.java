package ghost.designpatterns;
import ghost.designpatterns.state.Context;
import ghost.designpatterns.state.State;
import ghost.designpatterns.state.impl.ConCreateStateA;

public class Test{
	public static void main(String[] args) {
		State stateA = new ConCreateStateA();
		Context context = new Context(stateA);
		context.request();
		context.request();
		context.request();
		
	}
}