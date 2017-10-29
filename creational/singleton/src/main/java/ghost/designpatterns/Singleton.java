package ghost.designpatterns;


public class Singleton {
	private static Product product;

	public Singleton() {
	}
	
	public Product create(){
		if(product == null){
			System.out.println("init product");
			Singleton.product = new Product();
		}
		return Singleton.product;
	}
}
