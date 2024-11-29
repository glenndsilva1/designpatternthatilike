package designpatternthatilike.command;

public class LightCommand implements Command{
	Light light;
	
	public LightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.on();
	}
	
	public static void main(String args[]) {
		Command lo = new LightCommand(new Light());
		Context context = new Context();
		context.executeCommand(lo);
		context.undo();
	}

	@Override
	public void undo() {
		this.light.off();
	}
}
