package ghost.designpatterns;

import ghost.designpatterns.observer.Observer;
import ghost.designpatterns.observer.impl.ConCreateObserver1;
import ghost.designpatterns.observer.impl.ConCreateObserver2;
import ghost.designpatterns.subject.Subject;
import ghost.designpatterns.subject.impl.ConCreateSubject;

public class Test{
	public static void main(String[] args) {
		Subject subject = new ConCreateSubject();
		
		Observer observer1 = new ConCreateObserver1();
		Observer observer2 = new ConCreateObserver2();
		
		subject.register(observer1);
		subject.register(observer2);
		
		subject.notifyObservers();
		
		subject.deRegister(observer2);
		
		subject.notifyObservers();
	}
}