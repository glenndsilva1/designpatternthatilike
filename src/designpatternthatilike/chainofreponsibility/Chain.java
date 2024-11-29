package designpatternthatilike.chainofreponsibility;

public interface Chain {
	public void next(int amt);
	public void in(Chain chain);
	
	    public static void main(String args[]) {
	        Hundred hundred = new Hundred();
	        Fifty fifty = new Fifty();
	        hundred.in(fifty);  // Link the hundred handler to fifty handler
	        hundred.next(1151); // Process the amount (1150 in this case)
	    }

}

