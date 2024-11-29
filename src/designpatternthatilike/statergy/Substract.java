package designpatternthatilike.statergy;

public class Substract implements Computation{
	@Override
	public void calculation(int a, int b) {
		System.out.println("Substraction "+ (a-b));
	}
}
