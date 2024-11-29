package designpatternthatilike.visitor;

public class CreditCardCal implements Visitor {
	@Override
	public void visit(Discount visit) {
		System.out.println("Discount " + visit.discount());
	}

	@Override
	public void visit(CreditCard cr) {
		System.out.println("Credit Card " + cr.rate());
	}
	
	public static void main(String args[]) {
		Visitor v = new CreditCardCal();
		v.visit(new CreditCard());
	}
}
