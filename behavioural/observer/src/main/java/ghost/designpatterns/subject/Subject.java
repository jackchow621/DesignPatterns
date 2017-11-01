package ghost.designpatterns.subject;

import ghost.designpatterns.observer.Observer;

public interface Subject {
	public void register(Observer observer);
	
	public void deRegister(Observer observer);
	
	public void notifyObservers();
}
