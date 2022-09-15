//This clas represents an Item Object
//Items are mainly food and drinks
//Each item contains information regarding its micrinutrients
public class Item{

    //Variables
    public  String name;
    public  double carbsAmount;
    public double fatAmount;
    public double proteinAmount;
    public int calories;

    //Constructor
    public Item(String name, double carbsAmount, double fatAmount, double proteinAmount, int calories){
        this.name = name;
        this.carbsAmount = carbsAmount;
        this.fatAmount = fatAmount;
        this.proteinAmount = proteinAmount;
        this.calories = calories;
    }

    //Getters
    public String getName(){
        return name;
    }

    public double getCarbsAmount(){
        return carbsAmount;
    }

    public double getFatsAmount(){
        return fatAmount;
    }

    public double getProteinAmount(){
        return proteinAmount;
    }

    public int getCalories(){
        return calories;
    }

    //Setters
    public void setCarbsString(String name){
        this.name = name;
    }

    public void setCarbsAmount(double carbsAmount){
        this.carbsAmount = carbsAmount;
    }

    public void setFatsAmount(double fatsAmount){
        this.fatAmount = fatsAmount;
    }

    public void setProteinAmount(double proteinAmount){
        this.proteinAmount = proteinAmount;
    }

    public void setCalories(int calories){
       this.calories = calories; 
    }

    
    //toString method to create a formal output
    @Override
    public String toString(){
        return name;
    }

    public String getInfo(){
        return "Carbs: " +
            carbsAmount + "g" + "\nFats: " +
            fatAmount + "g " + "\nProtein: " +
            proteinAmount + "g" + "\nCalories: " +
            calories;
    }
}