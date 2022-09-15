import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewEntry extends LooseWeight implements ActionListener{

    //Declare some variables
    JFrame appFrame;
    private JButton add;
    public JTextField nameNE;
    public JTextField carbsNE;
    public JTextField fatsNE;
    public JTextField proteinNE;
    public JTextField caloriesNE;
    private JLabel nameLabel;
    private JLabel carbsLabel;
    private JLabel fatsLabel;
    private JLabel proteinLabel;
    private JLabel caloriesLabel;

    //Main Frame
    NewEntry(String name, double carbsAmount, double fatAmount, double proteinAmount, int calories){

        super(name, carbsAmount, fatAmount, proteinAmount, calories);


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
        add = new JButton();
        add.setText("Add");
        add.setBounds(100, 60, 80, 35);
        add.setFocusable(false);
        add.addActionListener(this);

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
        nameNE = new JTextField();
        nameNE.setBounds(50, 18, 70, 15);

        carbsNE = new JTextField();
        carbsNE.setBounds(170, 18, 25, 15);

        fatsNE = new JTextField();
        fatsNE.setBounds(235, 18, 25, 15);

        proteinNE = new JTextField();
        proteinNE.setBounds(318, 18, 25, 15);

        caloriesNE = new JTextField();
        caloriesNE.setBounds(255, 68, 35, 15);

        //Add to frame
        appFrame.add(add);
        appFrame.add(nameLabel);
        appFrame.add(carbsLabel);
        appFrame.add(fatsLabel);
        appFrame.add(proteinLabel);
        appFrame.add(caloriesLabel);
        appFrame.add(nameNE);
        appFrame.add(carbsNE);
        appFrame.add(fatsNE);
        appFrame.add(proteinNE);
        appFrame.add(caloriesNE);

        
    }

    //Add New Item To LooseWeight Frame
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){

            String n = nameNE.getText().toString();
            double c = Double.parseDouble(carbsNE.getText());
            double f = Double.parseDouble(fatsNE.getText());
            double p = Double.parseDouble(proteinNE.getText());
            int cal = Integer.parseInt(caloriesNE.getText());

            itemListDisplay.add(new Item(n, c, f, p, cal));

            for (Item i : itemListDisplay) {
                dummyModel.addElement(i);
              }


            appFrame.dispose();
        }
        
    }
}
