public class Cylinder extends Shape3 {

        private double radius;
        private double heigth;
    
        public Circle(String name, double radius,double heigth){
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
    
        public void setRadius(double radius){
            this.radius = radius;
        }
        public void setHeigth(double heigth){
            this.heigth = heigth;
        }
    
        public double getArea(){
            return Math.PI * radius * radius*heigth;
        }
    

    }
