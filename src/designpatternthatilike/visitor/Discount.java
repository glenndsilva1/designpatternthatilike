package designpatternthatilike.visitor;

public class Discount implements Visitable {
	@Override
	public void accepts(Visitor visitor) {
		visitor.visit(this);
	}
	
	public int discount() {
		return 10;
	}
}
