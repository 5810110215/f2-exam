import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape2d> shape2ds = new ArrayList<Shape2d>();
        ArrayList<Shape3d> shape3ds = new ArrayList<Shape3d>();
        try{
        Scanner num = new Scanner(new File("C:\\Users\\Lenovo\\Documents\\data.txt"));
        while(num.hasNextLine()){
            String line = "";
            double W = 0;
            double R = 0;
            double H = 0;
            double D = 0;
            int keyw;
            int keyh;
            int keyd;
            int keyr;
            
            line = num.nextLine();
            System.out.println(line);

            if(line.contains("W")){ 
                keyw =  line.lastIndexOf("W"); 
               W = Double.parseDouble(line.substring(keyw+1, keyw+3));
                if(line.contains("H")){
                   
                    keyh =  line.lastIndexOf("H");
                 
                  
                    H = Double.parseDouble(line.substring(keyh+1, keyh+3));
                    if(line.contains("D")){
                        
                      
                        keyd = line.lastIndexOf("D");
                        System.out.println(line.substring(keyd+1, keyd+2));
                        
                        D = Double.parseDouble(line.substring(keyd+1, keyd+3));
                        shape3ds.add(new Cuboid(line.substring(0,1),W,H,D));
                        System.out.println("cuboid w = "+ W +"h ="+ H + "d = "+ D);
                    }
                    else{
                        W = Double.parseDouble(line.substring(keyd+1, keyd+3));
                        H = Double.parseDouble(line.substring(keyh+1, keyh+3));
                        shape2ds.add(new Rectangle(line.substring(0,1),W,H));
                        System.out.println("rec w =" + W + "h = "+ H);
                    }
                }
                
            }
            else if(line.contains("R")){
                keyr =  line.lastIndexOf("R");
               R = Double.parseDouble(line.substring(keyr+1, keyr+3));
            
               if(keyr > 2){
                   System.out.println("Sphere r ="+ R);
                   shape3ds.add(new Sphere(line.substring(0,1),R));
               }
               else if(line.contains("H")){
                keyr =  line.lastIndexOf("H");
           
                H = Double.parseDouble(line.substring(keyr+1,keyr+3));
                   System.out.println("Cylinder h ="+ H + "r=" + R);
                   shape3ds.add(new Cylinder(line.substring(0,1),R,H));
                }
                else{
                   System.out.println("Circle r ="+ R);
                   shape2ds.add(new Circle(line.substring(0,1),R));
               }
            }
            for(Shape2d s : shape2ds){
                System.out.println(s.getName());
            }


           
        }
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}
