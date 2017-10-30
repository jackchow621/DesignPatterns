package ghost.designpatterns.flyweight.impl;

import ghost.designpatterns.flyweight.FlyWeight;


public class ConCreateFlyWeight implements FlyWeight {
	
	private String name;
	
	public ConCreateFlyWeight(String name) {
		this.name = name;
	}

	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("flyWeight "+name+" operated...");
	}

}
