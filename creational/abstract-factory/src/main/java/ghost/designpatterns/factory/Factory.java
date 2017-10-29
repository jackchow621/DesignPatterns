package ghost.designpatterns.factory;

import ghost.designpatterns.productA.ProductB;
import ghost.designpatterns.productB.ProductA;

public interface Factory {
	public ProductA createA();
	
	public ProductB createB();
}
