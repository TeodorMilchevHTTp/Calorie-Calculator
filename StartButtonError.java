import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartButtonError implements ActionListener{

    //Declare some variables
    private JFrame appFrame;
    private JLabel errorMessage;
    private JButton retryButton;

    //Main Frame
    StartButtonError(){
        appFrame = new JFrame();
        appFrame.setTitle("Error");
        appFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        appFrame.setSize(250, 150);
        appFrame.setLocationRelativeTo(null);
        appFrame.setResizable(false);
        appFrame.setVisible(true);
        appFrame.getContentPane().setBackground(new Color(123, 50, 250));
        appFrame.setLayout(null);

        //Button -> to either continue or close window
        retryButton = new JButton();
        retryButton.setText("OK");
        retryButton.setBounds(75, 60, 80, 35);
        retryButton.setFocusable(false);
        retryButton.addActionListener(this);

        //Label -> Message
        errorMessage = new JLabel();
        errorMessage.setText("Choose an option");
        errorMessage.setFont(new Font("MV Boli", Font.PLAIN, 20));
        errorMessage.setBounds(35, 15, 200, 20);
        errorMessage.setFocusable(false);

        //Add items to Frame
        appFrame.add(retryButton);
        appFrame.add(errorMessage);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==retryButton){
            JFrameOne frame = new JFrameOne();
            appFrame.dispose();
        }
        
    }
}
