import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Underweight{

    //Declare some variables
    private JFrame appFrame;
    private JLabel underweight;

    //Main Frame
    Underweight(){
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
        underweight = new JLabel();
        underweight.setText("You are Underweight");
        underweight.setBounds(155, 120, 50, 30);
        underweight.setFocusable(false);


        //add elements to frame
        appFrame.add(underweight);
    }

    //open app frame on button click
}
