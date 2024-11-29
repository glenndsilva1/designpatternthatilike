package designpatternthatilike.adaptor;

public class Adaption implements Enhanced{
    private Adaptee adaptee;
    
    public Adaption(Adaptee adaptee) {
    	this.adaptee = adaptee;
    }

	@Override
	public String firstname() {
		return adaptee.fullname().split(" ")[0];
	}
	

	@Override
	public String lastname() {
		return adaptee.fullname().split(" ")[1];
	}
	
	public static void main(String args[]) {
		Adaptee ad = new FullName("glenn dsilva");
		Enhanced ad1 = new  Adaption(ad);
		System.out.println(ad1.firstname());
		System.out.println(ad1.lastname());
	}
}
