package ghost.designpatterns.colleague.impl;

import ghost.designpatterns.colleague.Colleague;
import ghost.designpatterns.mediator.Mediator;

public class ConCreateColleagueA implements Colleague {

	public void receiveMsg() {
		// TODO Auto-generated method stub
		System.out.println("conCreateColleagueA receiveMsg...");
	}

	public void sendMsg(int vaule, Mediator mediator) {
		// TODO Auto-generated method stub
		mediator.operate(vaule);
	}

}
