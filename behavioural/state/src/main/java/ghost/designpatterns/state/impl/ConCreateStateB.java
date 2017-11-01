package ghost.designpatterns.state.impl;

import ghost.designpatterns.state.State;

public class ConCreateStateB implements State {

	public State execute() {
		// TODO Auto-generated method stub
		System.out.println("conCreateStateB executed...");
		return new ConCreateStateA();
	}

}
