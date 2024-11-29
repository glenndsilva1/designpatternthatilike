package designpatternthatilike.statergy;

public class Context {
	Computation computation;
	
	public Context(Computation comp) {
		this.computation = comp;
	}
	
	public void execute(int a, int b) {
		this.computation.calculation(a, b);
	}

	public static void main(String args[]) {
		Context context = new Context(new Add());
		context.execute(1, 3);
		Context context1 = new Context(new Substract());
		context1.execute(1, 4);
	}
	
}
