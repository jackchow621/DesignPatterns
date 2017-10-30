package ghost.designpatterns.adaptor;
public class Test{
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adaptor(adaptee);
		target.request();
	}
}