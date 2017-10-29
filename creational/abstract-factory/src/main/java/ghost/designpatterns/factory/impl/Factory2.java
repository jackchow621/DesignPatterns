package ghost.designpatterns.factory.impl;

import ghost.designpatterns.factory.Factory;
import ghost.designpatterns.productA.ProductB;
import ghost.designpatterns.productA.impl.ProductA2;
import ghost.designpatterns.productB.ProductA;
import ghost.designpatterns.productB.impl.ProductB2;

public class Factory2 implements Factory {

	public ProductA createA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	public ProductB createB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
