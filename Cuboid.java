public class Cuboid extends Shape3d {	//concrete class
	private double width;
    private double height;
    private double length;

	public Cuboid(String name, double width, double height,double length){
		super(name);
		this.width = width;
        this.height = height;
        this.length = length;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
	}

    public double getlength(){
		return length;
	}

	public void setlength(double height){
		this.length = length;
	}
	public double getArea(){
		return width * height*length;
	}

}