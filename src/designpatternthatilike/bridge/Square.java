package designpatternthatilike.bridge;

public class Square extends Shape{

	public Square(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Drawing shape");
		make();
	}

}
