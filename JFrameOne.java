import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class JFrameOne extends JFrame implements ItemListener, ActionListener{

    //Define some variables
    private JFrame frame;
    private JLabel greetMessage;
    private JButton startButton;
    private JLabel goal;
    private JCheckBox looseWeight;
    private JCheckBox gainMuscle;
    private ImageIcon logo;
    private JLabel displayLogo;

    public JFrameOne(){
        initialise();
    }

    public void initialise(){
        //Welcome message
        greetMessage = new JLabel();
        greetMessage.setText("Greetings Customer");
        greetMessage.setFont(new Font("MV Boli", Font.PLAIN, 25));
        greetMessage.setBounds(125, 0, 240, 30);

        //Create a message to user
        goal = new JLabel();
        goal.setText("What is your current goal?");
        goal.setFont(new Font("MV Boli", Font.PLAIN, 20));
        goal.setBounds(5, 60, 300, 30);
        
        //Present user with option 1
        looseWeight = new JCheckBox();
        looseWeight.setText("Loose Weight");
        looseWeight.setBounds(5, 140, 150, 30);
        looseWeight.setFocusable(false);
        looseWeight.setOpaque(false);
        looseWeight.addItemListener(this);

        //Present user with option 2
        gainMuscle = new JCheckBox();
        gainMuscle.setText("Gain Muscle");
        gainMuscle.setBounds(5,200, 150, 30);
        gainMuscle.setFocusable(false);
        gainMuscle.setOpaque(false);
        gainMuscle.addItemListener(this);

        //Start the actual app
        startButton = new JButton();
        startButton.setText("Start");
        startButton.setBounds(10, 280, 170, 50);
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        //Add a logo image
        logo = new ImageIcon(getClass().getResource("/images/logo.png"));
        displayLogo = new JLabel(logo);
        displayLogo.setFocusable(false);
        displayLogo.setBounds(180, 10, 512, 380);

        //Create the start Frame
        frame = new JFrame();
        frame.setTitle("Calorie Calculator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(123, 50, 250));

        //Add components to Frame
        frame.add(greetMessage);
        frame.add(goal);
        frame.add(startButton);
        frame.add(looseWeight);
        frame.add(gainMuscle);
        frame.add(displayLogo);

        //Allow control of where items are positioned
        frame.setLayout(null);

    }

    //Open main app frame
    @Override
    public void actionPerformed(ActionEvent e) {

            if(e.getSource()==startButton){
                if(looseWeight.isSelected()){
                frame.dispose();
                BMI appFrame = new BMI();   
                }else if(gainMuscle.isSelected()){
                frame.dispose();
                GainMuscle appFrame = new GainMuscle();
                }else{
                    StartButtonError error = new StartButtonError();
                    frame.dispose();
                }
            }
        }

        //Let user choose between two options
        @Override
        public void itemStateChanged(ItemEvent e) {
            // TODO Auto-generated method stub
            if(e.getItem()==looseWeight){
                if(looseWeight.isSelected()){
                    gainMuscle.setSelected(false);
                }
            }
            if(e.getItem()==gainMuscle){
                if(gainMuscle.isSelected()){
                    looseWeight.setSelected(false);
                }
            }
            
        }
}
