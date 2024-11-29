package designpatternthatilike.chainofreponsibility;

public class Hundred implements Chain {
    private Chain nextChain;

    @Override
    public void next(int amt) {
        if (amt >= 100) {
            int notes = amt / 100;  // Calculate number of 100 notes
            int remaining = amt % 100; // Remaining amount after 100 notes are deducted
            System.out.println("Hundred: " + notes + " notes of 100");
            if (nextChain != null) {
                nextChain.next(remaining); // Pass the remaining amount to the next chain
            }
        } else {
            if (nextChain != null) {
                nextChain.next(amt); // If less than 100, pass it to the next handler (Fifty)
            }
        }
    }

    @Override
    public void in(Chain chain) {
        this.nextChain = chain; // Set the next chain (Fifty in this case)
    }
}
