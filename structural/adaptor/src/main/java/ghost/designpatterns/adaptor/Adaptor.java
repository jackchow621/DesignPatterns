package ghost.designpatterns.adaptor;

public class Adaptor implements Target{
	private Adaptee adaptee;
	
	public Adaptor(Adaptee adaptee) {
		this.adaptee = adaptee;
	}



	public void request() {
		// TODO Auto-generated method stub
		adaptee.use();
	}
}
