package ghost.designpatterns.factory.impl;

import ghost.designpatterns.factory.Factory;
import ghost.designpatterns.product.Product;
import ghost.designpatterns.product.impl.ProductA;

public class FactoryA implements Factory {

	public Product create() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

}
