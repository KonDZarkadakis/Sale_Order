
import java.util.ArrayList;

public class OrderSaleList {

    private static ArrayList<Order> orderList = new ArrayList<Order>(); //Orders catalogue
    private static ArrayList<Sale> saleList = new ArrayList<Sale>(); //Sales catalogue


    //Show sales
    public void printSaleList(){
        for (Sale i : saleList){
            System.out.println(i.toString());
        }
    }

    //Show orders
    public void printOrderList(){
        int j = 0;
        for (Order i : orderList){
            System.out.println(++j + ") " + i.toString());
        }
    }

    //Show specific order
    public void printOrder(int i){
        System.out.println(orderList.get(i).toString());
    }

    //Input order element in order catalogue
    public void addOrderItem(Order _item){
        orderList.add(_item);
    }

    //Input sale element in order catalogue
    public void addSaleItem(Sale _item){
        saleList.add(_item);
    }

    //getters
    public static ArrayList<Order> getOrderList() {
        return orderList;
    }
    public static ArrayList<Sale> getSaleList() {
        return saleList;
    }
}
