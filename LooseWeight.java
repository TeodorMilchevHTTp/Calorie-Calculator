import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class LooseWeight extends Item implements ItemListener, ActionListener{

    //Declare some variables
    protected JFrame appFrame;
    protected JLabel breakfast;
    protected JLabel lunch;
    protected JLabel dinner;
    protected JLabel menu;
    protected JLabel caloriesInfo;
    protected JLabel carbs;
    protected JLabel fat;
    protected JLabel protein;
    protected JLabel ItemInfo;
    protected JList breakfastList;
    protected JList lunchList;
    protected JList dinnerList;
    protected JList menuList;
    protected JTextArea itemInfoList;
    protected JScrollPane breakfastpane;
    protected JScrollPane lunchPane;
    protected JScrollPane dinnerPane;
    protected JScrollPane menuPane;
    protected JScrollPane ItemInfoPane;
    protected ArrayList<Item> itemListDisplay;
    protected ArrayList<Item> breakfastItemsToHold;
    protected ArrayList<Item> lunchItemsToHold;
    protected ArrayList<Item> dinnerItemsToHold;
    protected JCheckBox breakfastCheck;
    protected JCheckBox lunchCheck;
    protected JCheckBox dinnerCheck;
    protected JButton addItem;
    protected JButton newEntry;
    protected DefaultListModel DefaultBreakfastList;
    protected DefaultListModel DefaultLunchList;
    protected DefaultListModel DefaultDinnerList;
    protected DefaultListModel dummyModel;

    //Main Frame
    LooseWeight(String name, double carbsAmount, double fatAmount, double proteinAmount, int calories){
        
        super(name, carbsAmount, fatAmount, proteinAmount, calories);

        appFrame = new JFrame();
        appFrame.setTitle("Loose Weight");
        appFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appFrame.setSize(500, 400);
        appFrame.setLocationRelativeTo(null);
        appFrame.setResizable(false);
        appFrame.setVisible(true);
        appFrame.getContentPane().setBackground(new Color(123, 50, 250));
        appFrame.setLayout(null);

        //Create arrays
        itemListDisplay = new ArrayList<Item>();
        itemListDisplay.add(new Item("Chicken Steak", 10, 5, 20, 200));
        itemListDisplay.add(new Item("123", 123, 123, 123, 123));
        itemListDisplay.add(new Item("Egg", 0, 1, 6, 75));

        //Empty arrays to old information
        

        //Default List Models to hold the Lists
        DefaultBreakfastList = new DefaultListModel<Item>();
        DefaultLunchList = new DefaultListModel<Item>();
        DefaultDinnerList = new DefaultListModel<Item>();
        dummyModel = new DefaultListModel<Item>();

        //Lists to hold in the arrays
        breakfastList = new JList<>();
        lunchList = new JList<>();
        dinnerList = new JList<>();
        menuList = new JList<>(dummyModel);
        itemInfoList = new JTextArea();
        itemInfoList.setEditable(false);

        
        menuList.getSelectionModel().addListSelectionListener(e -> {
           Item i =  (Item) menuList.getSelectedValue();
           itemInfoList.setText(i.getInfo());
        });

        //ScrollPanes to hold the Lists
        breakfastpane = new JScrollPane(breakfastList);
        breakfastpane.setBounds(15, 40, 130, 70);

        lunchPane = new JScrollPane(lunchList);
        lunchPane.setBounds(15, 155, 130, 70);

        dinnerPane = new JScrollPane(dinnerList);
        dinnerPane.setBounds(15, 270, 130, 70);

        menuPane = new JScrollPane(menuList);
        menuPane.setBounds(300, 70, 165, 130);

        ItemInfoPane = new JScrollPane(itemInfoList);
        ItemInfoPane.setBounds(300, 260, 165, 80);


        //Labels
        breakfast = new JLabel();
        breakfast.setText("Breakfast");
        breakfast.setBounds(38, 10, 100, 30);
        breakfast.setFont(new Font("MV Boli", Font.PLAIN, 20));

        lunch = new JLabel();
        lunch.setText("Lunch");
        lunch.setBounds(50, 125, 100, 30);
        lunch.setFont(new Font("MV Boli", Font.PLAIN, 20));

        dinner = new JLabel();
        dinner.setText("Dinner");
        dinner.setBounds(50, 240, 100, 30);
        dinner.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        menu = new JLabel();
        menu.setText("Menu");
        menu.setBounds(310,20, 150, 40);
        menu.setFont(new Font("MV Boli", Font.PLAIN, 50));

        caloriesInfo = new JLabel();
        caloriesInfo.setText("Calories: ");
        caloriesInfo.setBounds(170, 260, 70, 40);
        menu.setFont(new Font("MV Boli", Font.PLAIN, 50));

        carbs = new JLabel();
        carbs.setText("Carbs: ");
        carbs.setBounds(170, 280,70, 40);
        menu.setFont(new Font("MV Boli", Font.PLAIN, 50));

        fat = new JLabel();
        fat.setText("Fat: ");
        fat.setBounds(170, 300, 70, 40);
        menu.setFont(new Font("MV Boli", Font.PLAIN, 50));

        protein = new JLabel();
        protein.setText("Protein: ");
        protein.setBounds(170, 320, 70, 40);
        menu.setFont(new Font("MV Boli", Font.PLAIN, 50));

        ItemInfo = new JLabel();
        ItemInfo.setText("Info");
        ItemInfo.setBounds(340, 210, 150, 40);
        ItemInfo.setFont(new Font("MV Boli", Font.PLAIN, 40));

        //CheckBoxes
        breakfastCheck = new JCheckBox();
        breakfastCheck.setBounds(128, 12, 30, 30);
        breakfastCheck.setFocusable(false);
        breakfastCheck.setOpaque(false);
        breakfastCheck.addItemListener(this);

        lunchCheck = new JCheckBox();
        lunchCheck.setBounds(128, 126, 30, 30);
        lunchCheck.setFocusable(false);
        lunchCheck.setOpaque(false);
        lunchCheck.addItemListener(this);

        dinnerCheck = new JCheckBox();
        dinnerCheck.setBounds(128, 241, 30, 30);
        dinnerCheck.setFocusable(false);
        dinnerCheck.setOpaque(false);
        dinnerCheck.addItemListener(this);

        //Button
        addItem = new JButton();
        addItem.setText("Add");
        addItem.setFocusable(false);
        addItem.setBounds(220, 80, 70, 30);
        addItem.addActionListener(this);

        newEntry = new JButton();
        newEntry.setText("New Item");
        newEntry.setFocusable(false);
        newEntry.setBounds(200, 120, 90, 30);
        ActionListener listener1 = new OtherButtonListener();
        newEntry.addActionListener(listener1);
        
        

        //Add items to Main Frame
        appFrame.add(breakfastpane);
        appFrame.add(lunchPane);
        appFrame.add(dinnerPane);
        appFrame.add(breakfast);
        appFrame.add(lunch);
        appFrame.add(dinner);
        appFrame.add(menuPane);
        appFrame.add(menu);
        appFrame.add(caloriesInfo);
        appFrame.add(carbs);
        appFrame.add(fat);
        appFrame.add(protein);
        appFrame.add(ItemInfo);
        appFrame.add(ItemInfoPane);
        appFrame.add(breakfastCheck);
        appFrame.add(lunchCheck);
        appFrame.add(dinnerCheck);
        appFrame.add(addItem);
        appFrame.add(newEntry);
    }

    //Uncheck everything else when one option has been chosen
    @Override
        public void itemStateChanged(ItemEvent e) {
            // TODO Auto-generated method stub
            if(e.getItem()==breakfastCheck){
                if(breakfastCheck.isSelected()){
                    lunchCheck.setSelected(false);
                    dinnerCheck.setSelected(false);
                }
            }
            if(e.getItem()==lunchCheck){
                if(lunchCheck.isSelected()){
                    breakfastCheck.setSelected(false);
                    dinnerCheck.setSelected(false);
                }
            }
            if(e.getItem()==dinnerCheck){
                if(dinnerCheck.isSelected()){
                    breakfastCheck.setSelected(false);
                    lunchCheck.setSelected(false);
                }
            }
            
        }

        //Adding item from the menu based the ticked lists
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==addItem){
            if(breakfastCheck.isSelected()){
                if(menuList.getSelectedValue()==null){
                    System.out.println(":)");
                }else{
                breakfastItemsToHold = new ArrayList<Item>();
                breakfastList.setModel(DefaultBreakfastList);
                breakfastItemsToHold.add((Item) menuList.getSelectedValue());
                DefaultBreakfastList.addElement(breakfastItemsToHold.toString());
                }

            }else if (lunchCheck.isSelected()){
                if(menuList.getSelectedValue()==null){
                    System.out.println(":)");
                }else{
                lunchItemsToHold = new ArrayList<Item>();
                lunchItemsToHold.add((Item) menuList.getSelectedValue());
                DefaultLunchList.addElement(lunchItemsToHold.toString());
                lunchList.setModel(DefaultLunchList);
                }

            }else if(dinnerCheck.isSelected()){
                if(menuList.getSelectedValue()==null){
                    System.out.println(":)");
                }else{
                dinnerItemsToHold = new ArrayList<Item>();
                dinnerItemsToHold.add((Item) menuList.getSelectedValue());
                DefaultDinnerList.addElement(dinnerItemsToHold.toString());
                dinnerList.setModel(DefaultDinnerList);
                }
            }else{
                System.out.println(":)");
            }
        }
    }

    class OtherButtonListener implements ActionListener
            {
                public void actionPerformed(ActionEvent e)
                {
                    NewEntry entry = new NewEntry(name, carbsAmount, carbsAmount, carbsAmount, calories);
                    appFrame.dispose();
                    }
                }
}