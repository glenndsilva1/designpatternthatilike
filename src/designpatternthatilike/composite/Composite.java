package designpatternthatilike.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private String name;
	List<Component> t = new ArrayList<>();
	
	Composite(String name){
		this.name = name;
	}
	
	public void add(Component com) {
		t.add(com);
	}
	
	@Override
	public void display() {
		System.out.println("This name " + this.name);
		for (Component component : t) {
            component.display();;
        }
	}
	
	public static void main(String[] args){
        // Creating files
        Leaf file1 = new Leaf("File1.txt");
        Composite dir1 = new Composite("Documents");
        dir1.add(file1);
        dir1.display();
    }
}
