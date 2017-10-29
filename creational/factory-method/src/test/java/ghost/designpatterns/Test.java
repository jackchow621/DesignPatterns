package ghost.designpatterns;

import ghost.designpatterns.factory.Factory;
import ghost.designpatterns.factory.impl.FactoryA;
import ghost.designpatterns.factory.impl.FactoryB;
import ghost.designpatterns.product.Product;


public class Test{
	public static void main(String[] args) {
		Factory factory = new FactoryA();
		Product productA = factory.create();
		
		productA.use();
		
	    factory = new FactoryB();
		Product productB = factory.create();
		
		productB.use();
		
	}
}