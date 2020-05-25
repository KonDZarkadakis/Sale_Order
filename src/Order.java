import java.util.Scanner;

public class Order {

    private Item item;
    private static int oCode = 0;
    private int orderCode;
    private String modelName;
    private String Name;
    private String phone;
    private String date;
    private String estimateArrival;
    private double finalCost;
    private String orderState;

    //Order procedure
    public void proccedToOrder(Item _item) {
        Scanner in = new Scanner(System.in);
        System.out.println("There is no available balance of this product!\n" +
                "Do you want to procceed to order of this model? (Yes:1 , No:2) ");
        String answer = in.nextLine();
        if (answer.equals("1")) {
            oCode = oCode + 1;
            setItem(_item);
            setModelName(_item.modelName);
            System.out.println("\nGive the rest data of the order.");
            System.out.print("Give your name: ");
            setName(in.nextLine());
            System.out.print("\nGive your phone: ");
            setPhone(in.nextLine());
            System.out.print("\nGive order date: ");
            setDate(in.nextLine());
            System.out.print("\nGive estimated arrival date: ");
            setEstimateArrival(in.nextLine());
            setOrderState("Is expected");
            orderCode = oCode;
            if (_item instanceof PictureAndSound) {
                finalCost = _item.getPrice() - (_item.getPrice() * 0.25);
            } else if (_item instanceof Gaming) {
                finalCost = _item.getPrice() - (_item.getPrice() * 0.1);
            } else {
                finalCost = _item.getPrice() - (_item.getPrice() * 0.20);
            }
            OrderSaleList ord = new OrderSaleList();
            ord.addOrderItem(this);
            System.out.println("\nOrder code is: " + orderCode + " and the final cost is: " + finalCost);
            System.out.println("Successful transaction!");

        } else if (answer.equals("2")){
            System.out.println("Continue to choises.");
        } else {
            System.out.println("Wrong answer. Transaction cancelled!");
        }
    }


    public String toString(){
        return "Order Code: " + getOrderCode() + ", Model: " + getModelName() +
                ", Name: " + getName() + ", Phone: " + getPhone() +
                ", Date: " + getDate() + ", Estimated arrival date: " + getEstimateArrival() +
                ", Final Cost: " +  getFinalCost() + ", State: " + getOrderState();
    }

    //getters
    public Item getItem() {
        return item;
    }
    public static int getoCode() {
        return oCode;
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
    public String getEstimateArrival() {
        return estimateArrival;
    }
    public double getFinalCost() {
        return finalCost;
    }
    public String getOrderState() {
        return orderState;
    }
    public int getOrderCode() {
        return orderCode;
    }

    //setters
    public void setItem(Item item) {
        this.item = item;
    }
    public static void setoCode(int oCode) {
        Order.oCode = oCode;
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
    public void setEstimateArrival(String estimateArrival) {
        this.estimateArrival = estimateArrival;
    }
    public void setFinalCost(int finalCost) {
        this.finalCost = finalCost;
    }
    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }
}
