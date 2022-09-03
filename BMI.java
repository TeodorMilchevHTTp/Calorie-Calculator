import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMI implements ActionListener, KeyListener{

    //Declare some variables
    private JFrame appFrame;
    private JLabel weight;
    private JLabel height;
    private JTextField weightVal;
    private JTextField heightVal;
    private JButton continueButton;

    //Main Frame
    BMI(){
        appFrame = new JFrame();
        appFrame.setTitle("Error");
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setSize(350, 280);
        appFrame.setLocationRelativeTo(null);
        appFrame.setResizable(false);
        appFrame.setVisible(true);
        appFrame.getContentPane().setBackground(new Color(123, 50, 250));
        appFrame.setLayout(null);

        continueButton = new JButton();
        continueButton.setText("Continue");
        continueButton.setBounds(100, 190, 130, 35);
        continueButton.setFocusable(false);
        continueButton.addActionListener(this);

        weight = new JLabel();
        weight.setText("What is your current weight");
        weight.setFont(new Font("MV Boli", Font.PLAIN, 20));
        weight.setBounds(25, 15, 270, 25);
        weight.setFocusable(false);

        height = new JLabel();
        height.setText("What is your current height");
        height.setFont(new Font("MV Boli", Font.PLAIN, 20));
        height.setBounds(25,90, 270, 25);
        height.setFocusable(false);

        weightVal = new JTextField();
        weightVal.setBounds(120, 55, 90, 20);
        weightVal.addKeyListener(this);

        heightVal = new JTextField();
        heightVal.setBounds(120, 135, 90, 20);
        heightVal.addKeyListener(this);

        appFrame.add(continueButton);
        appFrame.add(weight);
        appFrame.add(height);
        appFrame.add(weightVal);
        appFrame.add(heightVal);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==continueButton){
            LooseWeight frame = new LooseWeight();
            appFrame.dispose();
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getSource()==weightVal){
            char c = e.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            e.consume();  // if it's not a number, ignore the event
            }
        }else if(e.getSource()==heightVal){
            char c = e.getKeyChar();
            if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                e.consume();  // if it's not a number, ignore the event
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}