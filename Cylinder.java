public class Cylinder extends Shape3{

        private double radius;
        private double heigth;
    
        public Cylinder(final String name, final double radius,final double heigth){
            super(name);
            this.radius = radius;
            this.heigth = heigth;
        }
    
        public double getRadius(){
            return radius;
        }
        public double getHeigth(){
            return heigth;
        }
    
        public void setRadius(final double radius){
            this.radius = radius;
        }
        public void setHeigth(final double heigth){
            this.heigth = heigth;
        }
    
        public double getArea(){
            return Math.PI * radius * radius*heigth;
        }
    

    }
