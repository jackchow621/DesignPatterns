package ghost.designpatterns.factory.impl;

import ghost.designpatterns.factory.Factory;
import ghost.designpatterns.productA.ProductB;
import ghost.designpatterns.productA.impl.ProductA1;
import ghost.designpatterns.productB.ProductA;
import ghost.designpatterns.productB.impl.ProductB1;

public class Factory1 implements Factory {

	public ProductA createA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	public ProductB createB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
