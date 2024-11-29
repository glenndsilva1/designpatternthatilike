package designpatternthatilike.iterator;

public class StringIterator implements MyIterator<String>{
	String name[];
	int ctr = 0;
	public StringIterator(String name[]) {
		this.name = name;
	}
	
	@Override
	public String next() {
		return name[ctr++];
	}

	@Override
	public boolean hasNext() {
		if(ctr < name.length) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		MyIterable<String> m = new StringIterable();
		MyIterator<String> i = m.iterator();
		
		
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		
	}
}
