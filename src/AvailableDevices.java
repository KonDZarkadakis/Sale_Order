import java.util.*;

public class AvailableDevices {

    //List for saving available devices
    private ArrayList<Item> availableItems = new ArrayList<Item>();
    //List for saving quantity of available devices
    private ArrayList<Integer> balance = new ArrayList<Integer>();

    //input available devices to list
    public void addItem(Item _item){
        availableItems.add(_item);
        balance.add(availableItems.indexOf(_item),1);
    }

    //quantity of an element
    public Integer getBalance(int i){
        return balance.get(i);
    }

    //raise quantity
    public void increaseBalance(int i){
        balance.set( i ,  balance.get(i)+1 );
    }

    //decrease quantity
    public void decreaseBalance(int i){
        balance.set( i ,  balance.get(i)-1 );
    }

    //get item from list
    public Item getItem(int i){
        return availableItems.get(i);
    }

    //show Item elements
    public void showDevices(int number) {
        if (number == 1) {
            int y = 1;
            for (int i = 0; i < availableItems.size(); i++) {
                if (availableItems.get(i) instanceof PictureAndSound && availableItems.get(i).getGeneralType().equals("television")) {
                    System.out.println(y++ + ". " + availableItems.get(i).getModelName());
                }
            }
        } else if (number == 2) {
            int y = 1;
            for (int i = 0; i < availableItems.size(); i++) {
                if (availableItems.get(i) instanceof PictureAndSound && availableItems.get(i).getGeneralType().equals("BD/DVD")) {
                    System.out.println(y++ + ". " + availableItems.get(i).getModelName());
                }
            }
        } else if (number == 3) {
            int y = 1;
            for (int i = 0; i < availableItems.size(); i++) {
                if (availableItems.get(i) instanceof PictureAndSound && availableItems.get(i).getGeneralType().equals("camera")) {
                    System.out.println(y++ + ". " + availableItems.get(i).getModelName());
                }
            }
        } else if (number == 4) {
            int y = 1;
            for (int i = 0; i < availableItems.size(); i++) {
                if (availableItems.get(i) instanceof Gaming) {
                    System.out.println(y++ + ". " + availableItems.get(i).getModelName());
                }
            }
        } else if (number == 5) {
            int y = 1;
            for (int i = 0; i < availableItems.size(); i++) {
                if (availableItems.get(i) instanceof HouseAppliances && availableItems.get(i).getGeneralType().equals("fridge")) {
                    System.out.println(y++ + ". " + availableItems.get(i).getModelName());
                }
            }
        } else {
            int y = 1;
            for (int i = 0; i < availableItems.size(); i++) {
                if (availableItems.get(i) instanceof HouseAppliances && availableItems.get(i).getGeneralType().equals("washer")) {
                    System.out.println(y++ + ". " + availableItems.get(i).getModelName());
                }
            }
        }
    }

}
