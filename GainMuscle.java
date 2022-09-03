import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GainMuscle{

    //Declare some variables
    private JFrame appFrame;
    private JLabel gainMuscle;

    //Main Frame
    GainMuscle(){
        appFrame = new JFrame();
        appFrame.setTitle("Gain Muscle");
        appFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appFrame.setSize(500, 400);
        appFrame.setLocationRelativeTo(null);
        appFrame.setResizable(false);
        appFrame.setVisible(true);
        appFrame.getContentPane().setBackground(new Color(123, 50, 250));
        appFrame.setLayout(null);
    }
}
