package ghost.designpatterns;

import ghost.designpatterns.impl.ConcreateComponent;

public class Test{
	public static void main(String[] args) {
		Component component = new ConcreateComponent();
		Component decorator = new Decorator(component);
		decorator.operate();
	}
}