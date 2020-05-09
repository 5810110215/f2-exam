public class Rectangle extends Shape2d {	//concrete class
	private double width;
	private double height;

	public Rectangle(final String name, final double width, final double height){
		super(name);
		this.width = width;
		this.height = height;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(final double width){
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(final double height){
		this.height = height;
	}

	public double getArea(){
		return width * height;
	}

}