package ghost.designpatterns;

import ghost.designpatterns.impl.ConCreateImplementor1;
import ghost.designpatterns.impl.ConCreateImplementor2;

public class Test{
	public static void main(String[] args) {
		Implementor implementor = new ConCreateImplementor1();
		Bridge bridge1 = new Bridge(implementor);
		bridge1.request();
		
		implementor = new ConCreateImplementor2();
		Bridge bridge2 = new Bridge(implementor);
		bridge2.request();
	}
}