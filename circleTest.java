package classes;

public class circleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle(25);
		Circle c3 = new Circle(47);
		
		System.out.println("Circle 1 radius: " + 
		c1.radius + " Circle 1 area: " + c1.getArea() +
		" Circle 1 perimeter: " + c1.getPerimeter());
		
		System.out.println("Circle 2 radius: " + 
		c2.radius + " Circle 2 area: " + c2.getArea() +
		" Circle 2 perimeter: " + c2.getPerimeter());
		
		System.out.println("Circle 3 radius: " + 
		c3.radius + " Circle 3 area: " + c3.getArea() +
		" Circle 3 perimeter: " + c3.getPerimeter());
	}

}
