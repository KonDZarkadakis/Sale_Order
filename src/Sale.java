import java.util.*;

public class Sale {

    private Item item;
    private static int sCode = 0;
    private int saleCode;
    private String modelName;
    private String Name;
    private String phone;
    private String date;
    private double finalCost;


    //Sale procedure
    public void proccedToSale(Item _item){
        Scanner in = new Scanner(System.in);
        sCode = sCode + 1;
        setItem(_item);
        setModelName(_item.modelName);
        System.out.println("\nGive the rest data of sale.");
        System.out.print("Give your name: ");
        setName(in.nextLine());
        System.out.print("\nGive your phone: ");
        setPhone(in.nextLine());
        System.out.print("\nGive sale date: ");
        setDate(in.nextLine());
        saleCode = sCode;
        if (_item instanceof PictureAndSound){
            finalCost = _item.getPrice() - (_item.getPrice() * 0.25);
        }else if (_item instanceof Gaming){
            finalCost = _item.getPrice() - (_item.getPrice() * 0.1);
        }else {
            finalCost = _item.getPrice() - (_item.getPrice() * 0.20);
        }
        System.out.print("\nSale code is: " + saleCode + " and the final cost is: " + finalCost);
        System.out.println("\nSuccessful transaction. Return to main menu");
        System.out.print("--------------------------------------------------\n");
    }



    public String toString(){
        return "Sale number: " + getSaleCode() + ", Model: " + getModelName() +
                ", Name: " + getName() + ", Phone: " + getPhone() +
                ", Date: " + getDate() + ", Final Cost: " + getFinalCost();
    }


    //getters
    public Item getItem() {
        return item;
    }
    public int getSaleCode() {
        return saleCode;
    }
    public String getModelName() {
        return modelName;
    }
    public String getName() {
        return Name;
    }
    public String getPhone() {
        return phone;
    }
    public String getDate() {
        return date;
    }
    public double getFinalCost() {
        return finalCost;
    }

    //setters
    public void setItem(Item item) {
        this.item = item;
    }
    public static void setsCode(int sCode) {
        Sale.sCode = sCode;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setFinalCost(int finalCost) {
        this.finalCost = finalCost;
    }
}
