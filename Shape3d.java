public abstract class Shape3d implements VolumeCalculable{
	private String name;
    public Shape3d(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}