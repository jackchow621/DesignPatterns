package ghost.designpatterns.command.impl;

import ghost.designpatterns.Receiver;
import ghost.designpatterns.command.Command;

public class ConCreateCommand implements Command {
	
	private Receiver receiver;
	
	public ConCreateCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
