public abstract class Shape3d implements VolumeCalculable{

	public Shape(String name){
		super(name);
	}

	public abstract double getArea();
}