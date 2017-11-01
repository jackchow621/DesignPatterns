package ghost.designpatterns.state;

public class Context {
	private State state;

	public Context(State state) {
		this.state = state;
	}
	
	public void request(){
		State s = state.execute();
		this.state = s;
		
	}
}
