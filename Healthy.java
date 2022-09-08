import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Healthy{

    //Declare some variables
    private JFrame appFrame;
    private JLabel healthy;

    //Main Frame
    Healthy(){
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
        healthy = new JLabel();
        healthy.setText("You are Healthy");
        healthy.setBounds(155, 120, 50, 30);
        healthy.setFocusable(false);


        //add elements to frame
        appFrame.add(healthy);
    }

    //open app frame on button click
}
