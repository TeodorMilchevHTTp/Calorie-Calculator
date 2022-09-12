import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewEntry implements ActionListener{

    //Declare some variables
    private JFrame appFrame;
    private JLabel errorMessage;
    private JButton retryButton;
    public JTextField name;
    public JTextField carbs;
    public JTextField fats;
    public JTextField protein;
    public JTextField calories;
    private JLabel nameLabel;
    private JLabel carbsLabel;
    private JLabel fatsLabel;
    private JLabel proteinLabel;
    private JLabel caloriesLabel;

    //Main Frame
    NewEntry(){
        appFrame = new JFrame();
        appFrame.setTitle("New Entry");
        appFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        appFrame.setSize(400, 150);
        appFrame.setLocationRelativeTo(null);
        appFrame.setResizable(false);
        appFrame.setVisible(true);
        appFrame.getContentPane().setBackground(new Color(123, 50, 250));
        appFrame.setLayout(null);

        //Button
        retryButton = new JButton();
        retryButton.setText("OK");
        retryButton.setBounds(100, 60, 80, 35);
        retryButton.setFocusable(false);
        retryButton.addActionListener(this);

        //Labels
        nameLabel = new JLabel();
        nameLabel.setText("Name: ");
        nameLabel.setBounds(10, 10, 40, 30);

        carbsLabel = new JLabel();
        carbsLabel.setText("Carbs: ");
        carbsLabel.setBounds(130, 10, 40, 30);

        fatsLabel = new JLabel();
        fatsLabel.setText("Fats: ");
        fatsLabel.setBounds(205, 10, 40, 30);

        proteinLabel = new JLabel();
        proteinLabel.setText("Protein: ");
        proteinLabel.setBounds(270, 10, 50, 30);

        caloriesLabel = new JLabel();
        caloriesLabel.setText("Calories: ");
        caloriesLabel.setBounds(200, 60, 60, 30);

        //TextFields
        name = new JTextField();
        name.setBounds(50, 18, 70, 15);

        carbs = new JTextField();
        carbs.setBounds(170, 18, 25, 15);

        fats = new JTextField();
        fats.setBounds(235, 18, 25, 15);

        protein = new JTextField();
        protein.setBounds(318, 18, 25, 15);

        calories = new JTextField();
        calories.setBounds(255, 68, 35, 15);

        //Add to frame
        appFrame.add(retryButton);
        appFrame.add(nameLabel);
        appFrame.add(carbsLabel);
        appFrame.add(fatsLabel);
        appFrame.add(proteinLabel);
        appFrame.add(caloriesLabel);
        appFrame.add(name);
        appFrame.add(carbs);
        appFrame.add(fats);
        appFrame.add(protein);
        appFrame.add(calories);

        
    }

    //exit window
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==retryButton){
            appFrame.dispose();
        }
        
    }
}
