package ghost.designpatterns;

import ghost.designpatterns.factory.Factory;
import ghost.designpatterns.factory.impl.Factory1;
import ghost.designpatterns.factory.impl.Factory2;
import ghost.designpatterns.productA.ProductB;
import ghost.designpatterns.productB.ProductA;



public class Test{
	public static void main(String[] args) {
		Factory factory = new Factory1();
		ProductA productA1 = factory.createA();
		ProductB productB1 = factory.createB();
		productA1.use();
		productB1.use();
		
		factory = new Factory2();
		ProductA productA2 = factory.createA();
		ProductB productB2 = factory.createB();
		productA2.use();
		productB2.use();
		
	}
}