package designpatternthatilike.composite;

public class Leaf implements  Component{
	private String name;
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void display() {
		System.out.println("In Leaf " + this.name);
	}
}
