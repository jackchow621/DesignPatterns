package ghost.designpatterns;

import ghost.designpatterns.flyweight.FlyWeight;
import ghost.designpatterns.flyweight.impl.ConCreateFlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	public static Map<String, FlyWeight> map = new HashMap<String, FlyWeight>();

	public static FlyWeight get(String name) {
		if (map.containsKey(name)) {
			return map.get(name);
		}

		FlyWeight flyWeight = new ConCreateFlyWeight(name);
		System.out.println("create a new flyweight...");
		map.put(name, flyWeight);
		return flyWeight;
	}
}
