package designpatternthatilike.command;

import java.util.Stack;

public class Context {
	private Stack<Command> history = new Stack<>();
	
	public void executeCommand(Command command) {
		command.execute();
		history.push(command);
	}
	
	public void undo() {
		if(!history.isEmpty()) {
			Command command = history.pop();
			command.undo();
		}
	}
}
