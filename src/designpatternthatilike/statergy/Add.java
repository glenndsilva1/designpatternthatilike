package designpatternthatilike.statergy;

public class Add implements Computation {
	@Override
	public void calculation(int a, int b) {
		System.out.println("Additin " + (a+b));
	}

}
