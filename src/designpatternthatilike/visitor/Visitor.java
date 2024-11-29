package designpatternthatilike.visitor;

public interface Visitor {
	public void visit(Discount visit);
	public void visit(CreditCard cr);
}
