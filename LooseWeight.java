import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LooseWeight extends Item{

    //Declare some variables
    private JFrame appFrame;
    private JLabel breakfast;
    private JLabel lunch;
    private JLabel dinner;
    private JLabel menu;
    private JLabel caloriesInfo;
    private JLabel carbs;
    private JLabel fat;
    private JLabel protein;
    private JLabel ItemInfo;
    private JList breakfastList;
    private JList lunchList;
    private JList dinnerList;
    private JList menuList;
    private JTextArea itemInfoList;
    private JScrollPane breakfastpane;
    private JScrollPane lunchPane;
    private JScrollPane dinnerPane;
    private JScrollPane menuPane;
    private JScrollPane ItemInfoPane;
    private ArrayList<Item> itemListDisplay;
    private ArrayList<Item> itemInfoListDisplay;

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
        itemListDisplay.add(new Item("Egg", 0, 1, 6, 75));

        //Lists to hold in the arrays
        breakfastList = new JList<>();
        lunchList = new JList<>();
        dinnerList = new JList<>();
        menuList = new JList<>(itemListDisplay.toArray());
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
        caloriesInfo.setBounds(170, 60, 70, 40);
        menu.setFont(new Font("MV Boli", Font.PLAIN, 50));

        carbs = new JLabel();
        carbs.setText("Carbs: ");
        carbs.setBounds(170, 80,70, 40);
        menu.setFont(new Font("MV Boli", Font.PLAIN, 50));

        fat = new JLabel();
        fat.setText("Fat: ");
        fat.setBounds(170, 100, 70, 40);
        menu.setFont(new Font("MV Boli", Font.PLAIN, 50));

        protein = new JLabel();
        protein.setText("Protein: ");
        protein.setBounds(170, 120, 70, 40);
        menu.setFont(new Font("MV Boli", Font.PLAIN, 50));

        ItemInfo = new JLabel();
        ItemInfo.setText("Info");
        ItemInfo.setBounds(340, 210, 150, 40);
        ItemInfo.setFont(new Font("MV Boli", Font.PLAIN, 40));

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
    }
}