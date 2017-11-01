package ghost.designpatterns.colleague;

import ghost.designpatterns.mediator.Mediator;

public interface Colleague {
	public void sendMsg(int vaule,Mediator mediator);
	public void receiveMsg();
}
