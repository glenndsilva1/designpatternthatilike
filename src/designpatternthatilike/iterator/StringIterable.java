package designpatternthatilike.iterator;


public class StringIterable implements MyIterable<String> {
	@Override
	public MyIterator<String> iterator() {
		// TODO Auto-generated method stub
		String name[] = {"g","l","e","n","n"};
		return new StringIterator(name) ;
	}
}
