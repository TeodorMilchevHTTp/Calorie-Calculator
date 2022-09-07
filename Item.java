//This clas represents an Item Object
//Items are mainly food and drinks
//Each item contains information regarding its micrinutrients
public class Item{

    //Variables
    protected  String name;
    protected  double carbsAmount;
    protected double fatAmount;
    protected double proteinAmount;

    //Constructor
    public Item(String name, double carbsAmount, double fatAmount, double proteinAmount){
        this.name = name;
        this.carbsAmount = carbsAmount;
        this.fatAmount = fatAmount;
        this.proteinAmount = proteinAmount;
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


    //toString method to create a formal output
    // @Override
    // public String toString(){
    //     return name + ":" + "Carbs:" +
    //         carbsAmount + "g, " + "Fats:" +
    //         fatAmount + "g, " + "Protein:" +
    //         proteinAmount + "g";
    // }

    @Override
    public String toString(){
        return name;
    }

    public int size() {
        return 0;
    }
}