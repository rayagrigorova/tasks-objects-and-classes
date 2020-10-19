package classes;

public class Circle {
	public double radius;
	
	public Circle(){radius = 1;}
	
	public Circle(double rad){
		if(rad > 0){
			radius = rad;
			return;
		}
		System.out.println("Radius must be a positive number");
		return;
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
}
