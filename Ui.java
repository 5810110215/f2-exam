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
        Scanner s = new Scanner( System.in );
            System.out.print("Enter first integer: ");
           int x = s.nextInt();
           System.out.print("Enter second integer: ");
           int y = s.nextInt();


      
		JLabel label;
		JFrame frame = new JFrame("Calculated");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
		JPanel facesPanel = new JPanel();
		JPanel labelPanel = new JPanel();
		GridLayout layout = new GridLayout(0, 3);
        
		facesPanel.setLayout(layout);
        
		label = new JLabel("OUTPUT");
		label.setFont(label.getFont().deriveFont(18.0f));

        JButton button = neOw JButton("KEY");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("VOLUME IS ");
            }
        });

		JButton buttont = new JButton("LENGTH");
        buttont.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("AREA IS");
            }
		});
		JButton buttonboth = new JButton("BOTH");
        buttonboth.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("This is 2D and 3D");
            }
		});

		
		facesPanel.add(button, BorderLayout.PAGE_END);
        facesPanel.add(buttont, BorderLayout.PAGE_END);
		facesPanel.add(buttonboth, BorderLayout.PAGE_END);
		labelPanel.add(label);

		frame.getContentPane().setLayout(new BorderLayout());
				
		frame.add(facesPanel, BorderLayout.PAGE_START);
		frame.add(labelPanel, BorderLayout.PAGE_END);
		
		frame.setVisible(true);
	}
}