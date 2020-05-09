public abstract class Shape2d implements AreaCalculable{
    private String name;
    public Shape2d(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
