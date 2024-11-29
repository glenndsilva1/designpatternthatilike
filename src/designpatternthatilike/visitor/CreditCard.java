package designpatternthatilike.visitor;

public class CreditCard implements Visitable {

	@Override
	public void accepts(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	public int rate() {
		return 19;
	}

}
