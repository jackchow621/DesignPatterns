package ghost.designpatterns;

import ghost.designpatterns.builder.Director;
import ghost.designpatterns.builder.impl.ConCreateBuilder;

public class Test{
	public static void main(String[] args) {
		Director director = new Director();
		director.setBuilder(new ConCreateBuilder());
		director.create();
	}
}