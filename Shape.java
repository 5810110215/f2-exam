public abstract class Shape implements AreaCalculable{

	public Shape(String name){
		super(name);
	}

	public abstract double getArea();
}