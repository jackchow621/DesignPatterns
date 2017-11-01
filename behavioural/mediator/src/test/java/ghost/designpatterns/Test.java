package ghost.designpatterns;

import ghost.designpatterns.colleague.Colleague;
import ghost.designpatterns.colleague.impl.ConCreateColleagueA;
import ghost.designpatterns.colleague.impl.ConCreateColleagueB;
import ghost.designpatterns.mediator.Mediator;
import ghost.designpatterns.mediator.impl.ConCreateMediator;

public class Test{
	public static void main(String[] args) {
		Mediator mediator = new ConCreateMediator();
		Colleague colleagueA = new ConCreateColleagueA();
		Colleague colleagueB = new ConCreateColleagueB();
		
		mediator.register(1, colleagueA);
		mediator.register(2, colleagueB);
		
		colleagueA.sendMsg(2, mediator);
		colleagueB.sendMsg(1, mediator);
	}
}