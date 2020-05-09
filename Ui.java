import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ui {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in );
            System.out.print("Enter first integer: ");
           int x = s.nextInt();
           System.out.print("Enter second integer: ");
           int y = s.nextInt();

           JFrame Frame frame = new JFrame("My App");
		    frame.setSize(400, 200);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
    }
	//anomynos class
        }
        public void actionPerformed(ActionEvent e) { 
            label.setText("" + Shape.getValue());	
        }
        
      
           
       
}
      
	