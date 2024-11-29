package designpatternthatilike.adaptor;

public class FullName implements Adaptee{
	private String name;
	
	public FullName(String name) {
		this.name = name;
	}
	
	public String fullname() {
		return this.name;
	}
}
