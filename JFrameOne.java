import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class JFrameOne extends JFrame implements ItemListener, ActionListener{
    private JFrame frame;
    private JLabel greetMessage;
    private JButton startButton;
    private JLabel goal;
    private JCheckBox looseWeight;
    private JCheckBox gainMuscle;

    public JFrameOne(){
        initialise();
    }

    public void initialise(){
        greetMessage = new JLabel();
        this.greetMessage.setText("Greetings Customer");
        this.greetMessage.setFont(new Font("MV Boli", Font.PLAIN, 25));
        this.greetMessage.setBounds(125, 0, 240, 30);

        goal = new JLabel();
        this.goal.setText("What is your current goal?");
        this.goal.setFont(new Font("MV Boli", Font.PLAIN, 20));
        this.goal.setBounds(0, 60, 300, 30);

        looseWeight = new JCheckBox();
        this.looseWeight.setText("Loose Weight");
        this.looseWeight.setBounds(0, 140, 150, 30);
        this.looseWeight.setOpaque(false);
        this.looseWeight.addItemListener(listener);

        gainMuscle = new JCheckBox();
        this.gainMuscle.setText("Gain Muscle");
        this.gainMuscle.setBounds(0,200, 150, 30);
        this.gainMuscle.setOpaque(false);
        this.gainMuscle.addItemListener(listener);


        startButton = new JButton();
        this.startButton.setText("Start");
        this.startButton.setBounds(155, 250, 170, 50);

        frame = new JFrame();
        this.frame.setTitle("Calorie Calculator");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
        this.frame.getContentPane().setBackground(new Color(123, 50, 250));
        
        this.frame.add(greetMessage);
        this.frame.add(goal);
        this.frame.add(startButton);
        this.frame.add(looseWeight);
        this.frame.add(gainMuscle);
        
        this.frame.setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        
    }

    ItemListener listener = new ItemListener(){

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

    };

}
