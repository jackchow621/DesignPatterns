package ghost.designpatterns;
public class Test{
	public static void main(String[] args) {
		Singleton singleton = new Singleton();
		Product product = singleton.create();
		product.use();
		
		product = singleton.create2();
		product.use();
		
	}
}
