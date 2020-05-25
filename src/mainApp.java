

// Omada Xristwn 5
// Zarkadakis Konstantinos
// p3190334


import java.util.*;

public class mainApp {
    static final String television = "television";
    static final String BR_DVD = "BD/DVD";
    static final String camera = "camera";
    static final String consoles = "consoles";
    static final String fridge = "fridge";
    static final String washer = "washer";

    //static ArrayList<Order> orderList = new ArrayList<Order>(); //Creation orders catalogue
    //static ArrayList<Sale> saleList = new ArrayList<Sale>(); //Creation sales catalogue

    public static void main(String [] args){

        mainMenu menu = new mainMenu();
        Scanner in = new Scanner(System.in);
        String answer, answer2, answer3, answer4, answer5;
        AvailableDevices availableDevices = new AvailableDevices(); //Creation available devices catalogue
        OrderSaleList orderSaleList = new OrderSaleList(); //Creation of object that contains catalogue of orders and sales



        PictureAndSound tel1 = new PictureAndSound(television,"0001","32LK6200",2018,"LG",224.78,
                "LED",32,"2K","HDMI");
        PictureAndSound tel2 = new PictureAndSound(television,"0002","UE55RU7092",2019,"Samsung",395.95,
                "LED",55,"4K","HDMI");

        PictureAndSound BR1 = new PictureAndSound(BR_DVD,"0003","BP250",2018,"LG",66.90,
                "BLUE_RAY","4K","BD-R");
        PictureAndSound BR2 = new PictureAndSound(BR_DVD,"0004","DVP-SR170",2019,"Sony",35.24,
                "DVD","HD","DVD-RW");

        PictureAndSound cam1 = new PictureAndSound(camera,"0005","Powershot SX620 HS",2019,"Canon",194.69,
                "compact","20","40x","4x",8);
        PictureAndSound cam2 = new PictureAndSound(camera,"0006","D3500 Kit",2019,"Nikon",394,
                "DSLR","40","40x","4x",7);

        Gaming cons1 = new Gaming(consoles,"0007","Playstation 4",2013,"Sony",200,
                "PS4","AMD","HD","THX",150);
        Gaming cons2 = new Gaming(consoles,"0008","Xbox One",2013,"Microsoft",214,
                "Xbox","AMD","HD","THX",200);

        HouseAppliances frid1 = new HouseAppliances(fridge,"0009","CBN-320DIX",2019,"Crown",339.95,
                "One door","A+",20,10);
        HouseAppliances frid2 = new HouseAppliances(fridge,"0010","GSL760PZUZ",2019,"LG",954,
                "Double door","A++",25,10);

        HouseAppliances wash1 = new HouseAppliances(washer,"0011","WQP1200G9",2018,"Pitsos",384.99,
                "B+",25,1500);
        HouseAppliances wash2 = new HouseAppliances(washer,"0012","CSO 14105TB3/1-S",2017,"Candy",297.60,
                "B++",35,2700);


        availableDevices.addItem(tel1);
        availableDevices.addItem(tel2);
        availableDevices.addItem(BR1);
        availableDevices.addItem(BR2);
        availableDevices.addItem(cam1);
        availableDevices.addItem(cam2);
        availableDevices.addItem(cons1);
        availableDevices.addItem(cons2);
        availableDevices.addItem(frid1);
        availableDevices.addItem(frid2);
        availableDevices.addItem(wash1);
        availableDevices.addItem(wash2);



        while(true){
            menu.mainScreen();
            answer = in.nextLine();

            //DEVICES
            if(answer.equals("0")){

                outerloop:
                while (true) {
                    menu.availableCategories();
                    answer2 = in.nextLine();

                    //CATEGORY CHOOSE
                    //Wrong choice
                    if (answer2.equals("0")) {
                        System.out.println("---------------------------");
                        break;

                    //Picture And Sound
                    } else if (answer2.equals("1")) {

                        while (true){
                            menu.availableSoundAndPicture();
                            answer3 = in.nextLine();

                            //TYPE CHOOSE
                            //Wrong choice
                            if (answer3.equals("0")){
                                break;
                            }
                            //Television
                            else if (answer3.equals("1")) {
                                menu.chooseDevice();
                                availableDevices.showDevices(1);
                                menu.giveNumber();
                                answer4 = in.nextLine();

                                if (answer4.equals("1")){
                                    System.out.println(availableDevices.getItem(0));
                                    ////////////////////////////
                                    if (availableDevices.getBalance(0) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(0));
                                        availableDevices.decreaseBalance(0);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(0));
                                        break outerloop;
                                    }
                                }else if (answer4.equals("2")){
                                    System.out.println(availableDevices.getItem(1));
                                    //////////////////////////
                                    if (availableDevices.getBalance(1) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(1));
                                        availableDevices.decreaseBalance(1);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(1));
                                        break outerloop;
                                    }
                                }else {
                                    menu.errorMessage();
                                }
                            //Blue ray / DVD
                            } else if (answer3.equals("2")) {
                                menu.chooseDevice();
                                availableDevices.showDevices(2);
                                menu.giveNumber();
                                answer4 = in.nextLine();

                                if (answer4.equals("1")){
                                    System.out.println(availableDevices.getItem(2));
                                    ////////////////////////
                                    if (availableDevices.getBalance(2) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(2));
                                        availableDevices.decreaseBalance(2);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(2));
                                        break outerloop;
                                    }
                                }else if (answer4.equals("2")){
                                    System.out.println(availableDevices.getItem(3));
                                    /////////////////////////////
                                    if (availableDevices.getBalance(3) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(3));
                                        availableDevices.decreaseBalance(3);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(3));
                                        break outerloop;
                                    }
                                }else {
                                    menu.errorMessage();
                                }
                            //Cameras
                            } else if (answer3.equals("3")) {
                                menu.chooseDevice();
                                availableDevices.showDevices(3);
                                menu.giveNumber();
                                answer4 = in.nextLine();

                                if (answer4.equals("1")){
                                    System.out.println(availableDevices.getItem(4));
                                    ///////////////////////////////
                                    if (availableDevices.getBalance(4) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(4));
                                        availableDevices.decreaseBalance(4);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(4));
                                        break outerloop;
                                    }
                                }else if (answer4.equals("2")){
                                    System.out.println(availableDevices.getItem(5));
                                    //////////////////////////////
                                    if (availableDevices.getBalance(5) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(5));
                                        availableDevices.decreaseBalance(5);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(5));
                                        break outerloop;
                                    }
                                }else {
                                    menu.errorMessage();
                                }

                            } else {
                                menu.errorMessage();
                            }
                        }
                    //Gaming
                    } else if (answer2.equals("2")) {

                        menu.availableGaming();
                        availableDevices.showDevices(4);
                        answer4 = in.nextLine();
                        menu.chooseDevice();
                        if (answer4.equals("1")){
                            System.out.println(availableDevices.getItem(6));
                            /////////////////////////////////
                            if (availableDevices.getBalance(6) > 0){
                                Sale sale = new Sale();
                                sale.proccedToSale(availableDevices.getItem(6));
                                availableDevices.decreaseBalance(6);
                                orderSaleList.addSaleItem(sale);
                                break outerloop;
                            }else {
                                Order order = new Order();
                                order.proccedToOrder(availableDevices.getItem(6));
                                break outerloop;
                            }
                        }else if (answer4.equals("2")){
                            System.out.println(availableDevices.getItem(7));
                            //////////////////////////////////
                            if (availableDevices.getBalance(7) > 0){
                                Sale sale = new Sale();
                                sale.proccedToSale(availableDevices.getItem(7));
                                availableDevices.decreaseBalance(7);
                                orderSaleList.addSaleItem(sale);
                                break outerloop;
                            }else {
                                Order order = new Order();
                                order.proccedToOrder(availableDevices.getItem(7));
                                break outerloop;
                            }
                        }else {
                            menu.errorMessage();
                        }
                    //House Appliances
                    } else if (answer2.equals("3")) {

                        while (true) {
                            menu.availableHouseAppliances();
                            answer3 = in.nextLine();

                            //TYPE CHOOSE
                            //Wrong choice
                            if (answer3.equals("0")){
                                break;
                            }
                            if (answer3.equals("1")) {
                                menu.chooseDevice();
                                availableDevices.showDevices(5);
                                menu.giveNumber();
                                answer4 = in.nextLine();

                                if (answer4.equals("1")){
                                    System.out.println(availableDevices.getItem(8));
                                    ///////////////////////////////
                                    if (availableDevices.getBalance(8) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(8));
                                        availableDevices.decreaseBalance(8);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(8));
                                        break outerloop;
                                    }
                                }else if (answer4.equals("2")){
                                    System.out.println(availableDevices.getItem(9));
                                    /////////////////////////////////
                                    if (availableDevices.getBalance(9) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(9));
                                        availableDevices.decreaseBalance(9);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(9));
                                        break outerloop;
                                    }
                                }else {
                                    menu.errorMessage();
                                }
                            } else if (answer3.equals("2")) {
                                menu.chooseDevice();
                                availableDevices.showDevices(6);
                                menu.giveNumber();
                                answer4 = in.nextLine();

                                if (answer4.equals("1")){
                                    System.out.println(availableDevices.getItem(10));
                                    ////////////////////////////////
                                    if (availableDevices.getBalance(10) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(10));
                                        availableDevices.decreaseBalance(10);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(10));
                                        break outerloop;
                                    }
                                }else if (answer4.equals("2")){
                                    System.out.println(availableDevices.getItem(11));
                                    ////////////////////////////////
                                    if (availableDevices.getBalance(11) > 0){
                                        Sale sale = new Sale();
                                        sale.proccedToSale(availableDevices.getItem(11));
                                        availableDevices.decreaseBalance(11);
                                        orderSaleList.addSaleItem(sale);
                                        break outerloop;
                                    }else {
                                        Order order = new Order();
                                        order.proccedToOrder(availableDevices.getItem(11));
                                        break outerloop;
                                    }
                                }else {
                                    menu.errorMessage();
                                }
                            } else {
                                menu.errorMessage();
                            }
                        }
                    }else{
                        menu.errorMessage();
                    }
                }
            }

            //ORDERS
            else if (answer.equals("1")){
                System.out.println("\nBelow is the orders catalogue:");
                menu.chooseOrder();
                orderSaleList.printOrderList();
                menu.giveNumber();
                answer4 = in.nextLine();
                if (Integer.parseInt(answer4)>0 && Integer.parseInt(answer4)<=OrderSaleList.getOrderList().size()){
                    int ans4 = Integer.parseInt(answer4);
                    orderSaleList.printOrder(ans4-1);
                    System.out.println("Do you want arrival of order and then sale? (Yes:1 , No:2)");
                    answer5 = in.nextLine();
                    if (answer5.equals("1")){
                        OrderSaleList.getOrderList().get(ans4-1).setOrderState("Executed");
                        Sale sale = new Sale();
                        sale.proccedToSale(OrderSaleList.getOrderList().get(ans4-1).getItem());
                        orderSaleList.addSaleItem(sale);
                    }else if(answer5.equals("2")){

                    }else {
                        menu.errorMessage2();
                        break;
                    }
                }else if (answer4.equals("0")){
                    continue;
                }else{
                    menu.errorMessage2();
                }
            }

            //SALES
            else if (answer.equals("2")){
                System.out.println("\nBelow is the sales catalogue:");
                orderSaleList.printSaleList();
            }

            //EXIT
            else if(answer.equals("3")){
                menu.goodbyeMessage();
                break;
            }

            //WRONG TYPING
            else{
                menu.errorMessage();
            }
        }
    }
}
