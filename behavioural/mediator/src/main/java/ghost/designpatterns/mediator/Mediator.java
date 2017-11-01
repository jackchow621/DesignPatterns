package ghost.designpatterns.mediator;

import ghost.designpatterns.colleague.Colleague;

public interface Mediator {
	public void register(int value,Colleague colleague);
	
	public void operate(int vaule);
}
