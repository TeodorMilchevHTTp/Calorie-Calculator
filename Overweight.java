import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Overweight{

    //Declare some variables
    private JFrame appFrame;
    private JLabel overweight;

    //Main Frame
    Overweight(){
        appFrame = new JFrame();
        appFrame.setTitle("BMI");
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setSize(350, 280);
        appFrame.setLocationRelativeTo(null);
        appFrame.setResizable(false);
        appFrame.setVisible(true);
        appFrame.getContentPane().setBackground(new Color(123, 50, 250));
        appFrame.setLayout(null);

        //Set Label
        overweight = new JLabel();
        overweight.setText("You are Overweight");
        overweight.setBounds(155, 120, 50, 30);
        overweight.setFocusable(false);


        //add elements to frame
        appFrame.add(overweight);
    }

    //open app frame on button click
}