package ghost.designpatterns;

public class Decorator implements Component{
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("decorator operated...");
		component.operate();
	}
	
	
}
