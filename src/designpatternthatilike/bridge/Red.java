package designpatternthatilike.bridge;

public class Red extends Color{
	
	
	@Override
	public void fill() {
		System.out.println("Fill The Color with Red");
	}
	
	public static void main(String args[]) {
		Color red = new Red();
		Shape shape = new Square(red);
		shape.draw();
		Shape circle = new Circle(new Green());
		circle.draw();
	}
}
