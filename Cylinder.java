public class Cylinder extends Shape3d{

        private double radius;
        private double heigth;
    
        public Cylinder(String name, final double radius,final double heigth){
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

        @Override
        public double getVolume() {
            // TODO Auto-generated method stub
            return 0;
        }
    

    }
