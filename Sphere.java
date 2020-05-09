public class Sphere extends Shape3d {	//concrete class
	private double radius;

	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getArea(){
		return 4/3*(Math.PI * radius * radius * radius);
	}
	
}