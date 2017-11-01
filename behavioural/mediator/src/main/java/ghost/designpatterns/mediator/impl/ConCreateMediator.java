package ghost.designpatterns.mediator.impl;

import ghost.designpatterns.colleague.Colleague;
import ghost.designpatterns.mediator.Mediator;

import java.util.HashMap;
import java.util.Map;

public class ConCreateMediator implements Mediator {
	private Map<Integer, Colleague> map = new HashMap<Integer, Colleague>();

	public void operate(int vaule) {
		// TODO Auto-generated method stub
		map.get(vaule).receiveMsg();
	}

	public void register(int value, Colleague colleague) {
		// TODO Auto-generated method stub
		map.put(value,colleague);
	}

}
