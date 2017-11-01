package ghost.designpatterns.state.impl;

import ghost.designpatterns.state.State;

public class ConCreateStateA implements State {

	public State execute() {
		// TODO Auto-generated method stub
		System.out.println("conCreateStateA executed...");
		return new ConCreateStateB();
	}

}
