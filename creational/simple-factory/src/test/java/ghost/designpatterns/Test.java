package ghost.designpatterns;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f = new Factory();
		Product p = f.create("A");
		System.out.println(p.getName());
		p = f.create("B");
		System.out.println(p.getName());
	}

}
