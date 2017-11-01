package ghost.designpatterns.colleague.impl;

import ghost.designpatterns.colleague.Colleague;
import ghost.designpatterns.mediator.Mediator;

public class ConCreateColleagueB implements Colleague {

	public void receiveMsg() {
		// TODO Auto-generated method stub
		System.out.println("conCreateColleagueB receiveMsg...");
	}

	public void sendMsg(int vaule, Mediator mediator) {
		// TODO Auto-generated method stub
		mediator.operate(vaule);
	}

}
