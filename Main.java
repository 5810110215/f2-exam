import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        try{
        Scanner num = new Scanner(new File("C:\\Users\\Lenovo\\Documents\\data.txt"));
        while(num.hasNextLine()){  
        String currentline = num.nextLine();
           System.out.println(currentline);
        }

        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
    }
}
