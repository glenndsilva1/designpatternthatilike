package designpatternthatilike.chainofreponsibility;

public class Fifty implements Chain {
    private Chain nextChain;

    @Override
    public void next(int amt) {
        if (amt >= 50) {
            int notes = amt / 50;  // Calculate number of 50 notes
            int remaining = amt % 50; // Remaining amount after 50 notes are deducted
            System.out.println("Fifty: " + notes + " notes of 50");
            if (nextChain != null) {
                nextChain.next(remaining); // Pass the remaining amount to the next chain
            }
        } else {
            if (nextChain != null) {
                nextChain.next(amt); // If less than 50, pass it to the next handler (if any)
            }
        }
    }

    @Override
    public void in(Chain chain) {
        this.nextChain = chain; // Set the next chain (if any)
    }
}

