package prernabhardwaj;
abstract class Shape 
{
	abstract void draw();
	
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("draw rectangle ");
		
	}
		
	}
class Circle  extends Shape {
	void draw() {
		System.out.println("draw circle ");
	
}

}
public class Abstraction {

	public static void  main(String[] args) {
		Shape obj=new Circle();
		Shape s=new Rectangle();
		obj.draw();
		s.draw();
	}
}
	
