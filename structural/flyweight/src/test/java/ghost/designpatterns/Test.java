package ghost.designpatterns;

import ghost.designpatterns.flyweight.FlyWeight;

public class Test{
	public static void main(String[] args) {
		FlyWeight flyWeight = FlyWeightFactory.get("a");
		flyWeight.operate();
		
		flyWeight = FlyWeightFactory.get("b");
		flyWeight.operate();
		
		flyWeight = FlyWeightFactory.get("c");
		flyWeight.operate();
	}
}