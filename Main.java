import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class Final {
    public static void main(final String[] args) {
 
        try{
        Scanner sc = new Scanner(new File("C:\\Users\\Lenovo\\Documents\\data.txt"));
           String currentline = sc.nextLine();
           System.out.println(currentline);


        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
    }
}
