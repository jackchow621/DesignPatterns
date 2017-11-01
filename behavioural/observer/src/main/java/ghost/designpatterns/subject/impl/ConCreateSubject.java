package ghost.designpatterns.subject.impl;

import ghost.designpatterns.observer.Observer;
import ghost.designpatterns.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConCreateSubject implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();


	public void register(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	public void deRegister(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : observers){
			observer.update();
		}
	}


}
