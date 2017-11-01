package ghost.designpatterns;

import ghost.designpatterns.command.Command;
import ghost.designpatterns.command.impl.ConCreateCommand;

public class Test{
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConCreateCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.call();
	}
}