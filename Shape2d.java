public abstract class Shape2d implements AreaCalculable{

	public Shape(String name){
		super(name);
	}

	public abstract double getArea();
}