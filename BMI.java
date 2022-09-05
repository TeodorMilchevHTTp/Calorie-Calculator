import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.text.DecimalFormat;

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
    private JLabel kg;
    private JLabel m;
    private JButton continueButton;
    private JLabel bmi;
    private JButton calculate;
    private JTextField output;

    //Main Frame
    BMI(){
        appFrame = new JFrame();
        appFrame.setTitle("BMI");
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setSize(350, 280);
        appFrame.setLocationRelativeTo(null);
        appFrame.setResizable(false);
        appFrame.setVisible(true);
        appFrame.getContentPane().setBackground(new Color(123, 50, 250));
        appFrame.setLayout(null);

        //continue to main app
        continueButton = new JButton();
        continueButton.setText("Continue");
        continueButton.setBounds(25, 190, 130, 35);
        continueButton.setFocusable(false);
        continueButton.addActionListener(this);
        
        //weight label
        weight = new JLabel();
        weight.setText("What is your current weight");
        weight.setFont(new Font("MV Boli", Font.PLAIN, 20));
        weight.setBounds(25, 15, 270, 25);
        weight.setFocusable(false);

        //height label
        height = new JLabel();
        height.setText("What is your current height");
        height.setFont(new Font("MV Boli", Font.PLAIN, 20));
        height.setBounds(25,90, 270, 25);
        height.setFocusable(false);

        //text field
        weightVal = new JTextField();
        weightVal.setBounds(120, 55, 90, 20);
        weightVal.addKeyListener(this);

        //text field
        heightVal = new JTextField();
        heightVal.setBounds(120, 135, 90, 20);
        heightVal.addKeyListener(this);

        //indication for metrix
        kg = new JLabel();
        kg.setText("Kilogram");
        kg.setBounds(215, 35, 70, 70);
        kg.setFocusable(false);

        //indication for metrix
        m = new JLabel();
        m.setText("Meter");
        m.setBounds(215, 115, 70, 70);
        m.setFocusable(false);

        //indication
        bmi = new JLabel();
        bmi.setBounds(200, 190, 50, 50);

        //calculate button
        calculate = new JButton();
        calculate.setText("Calculate");
        calculate.setBounds(195, 175, 100, 20);
        calculate.setFocusable(false);
        ActionListener listener1 = new OtherButtonListener();
        calculate.addActionListener(listener1);

        //output
        output = new JTextField();
        output.setFont(new Font("Verdana", Font.PLAIN, 16));
        output.setForeground(Color.BLACK);
        output.setEditable(false);
        output.setBounds(195, 205, 100, 20);

        //add elements to frame
        appFrame.add(continueButton);
        appFrame.add(weight);
        appFrame.add(height);
        appFrame.add(weightVal);
        appFrame.add(heightVal);
        appFrame.add(kg);
        appFrame.add(m);
        appFrame.add(bmi);
        appFrame.add(calculate);
        appFrame.add(output);
    }

    //open app frame on button click
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==continueButton){
            if(output.getText().isEmpty()){
                appFrame.dispose();
                BMIerror error = new BMIerror();
            }else{
            LooseWeight frame = new LooseWeight();
            appFrame.dispose();
            }
        }
    }
        
    //Calculate BMI on Button Click
    class OtherButtonListener implements ActionListener
            {
                public void actionPerformed(ActionEvent e)
                {
                    double x = Integer.parseInt(weightVal.getText());
                    double y = Integer.parseInt(heightVal.getText());
                    DecimalFormat df = new DecimalFormat("00.00");
                    double f = (x/(y*y));
                
                    if(e.getSource()==calculate){
                        //Needs fix
                        if(weightVal.getText().isEmpty() || heightVal.getText().isEmpty()){
                            BMIerror error= new BMIerror();
                            appFrame.dispose();
                        }else{
                            output.setText(String.valueOf(f));
                            System.out.println(df.format(f));
                            }
                        }
                    }
                }
            
    //deny imput that isn't numeric
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