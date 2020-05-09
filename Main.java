import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        try{
        Scanner num = new Scanner(new File("C:\\Users\\Lenovo\\Documents\\data.txt"));
        while(num.hasNextLine()){
            String line = "";
            line = num.nextLine();
            System.out.println(line);
            
            if(line.contains("W")){
                if(line.contains("H")){
                    if(line.contains("D")){
                        System.out.println("Cuboid");
                    }
                    else{
                        System.out.println("Rectangle");
                    }
                }

            }
            else if(line.contains("R")){
               int key =  line.lastIndexOf("R");
           
               System.out.println(key);
               if(key > 2){
                   System.out.println("Sphere");
               }
               else if(line.contains("H")){
                   System.out.println("Cylinder");
                }
                else{
                   System.out.println("Circle");
               }
            }



        }

        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
    }
}
