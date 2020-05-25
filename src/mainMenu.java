
public class mainMenu {


    protected void goodbyeMessage(){
        System.out.println("---------------------------------------------");
        System.out.println("We hope that your experience was good!\n" +
                "Thank you.");
    }

    protected void errorMessage(){
        System.out.println("-------------------------------------------------");
        System.out.println("Wrong typing. Please type \n" +
                "again the number of your choise.");
    }

    protected void errorMessage2(){
        System.out.println("-------------------------------------------------");
        System.out.println("Wrong typing.");
    }

    protected void mainScreen(){
        System.out.println("---------------------------");
        System.out.println("0. Devices Overview");
        System.out.println("1. Orders Overview");
        System.out.println("2. Sales Overview");
        System.out.println("3. Exit");
        //System.out.println("\n");
        System.out.print("Give your choise (number): ");
    }


    protected void availableCategories(){
        System.out.println("--------------------------");
        System.out.println("Choose the device category or press zero (o) to return to main menu: ");
        System.out.println("1. Picture and Sound");
        System.out.println("2. Gaming");
        System.out.println("3. House Appliances");
        System.out.print("Give your choise (number): ");
    }

    protected void availableSoundAndPicture(){
        System.out.println("\n--------------------------");
        System.out.println("Choose the device type or press zero (0) to return to main menu: ");
        System.out.println("1. Television");
        System.out.println("2. Blue Ray/DVD players");
        System.out.println("3. Cameras");
        System.out.print("Give your choise (number): ");
    }

    protected void availableGaming(){
        System.out.println("--------------------------");
        System.out.println("Chose console type or press zero (0) to return to main menu: ");
    }

    protected void availableHouseAppliances(){
        System.out.println("--------------------------");
        System.out.println("Choose the device type or press zero (0) to return to main menu: ");
        System.out.println("1. Fridge");
        System.out.println("2. Washing Machines");
        System.out.print("Give your choise (number): ");
    }

    protected void chooseDevice(){
        System.out.println("\nChoose the device or press zero (0) to return to main menu: ");
    }

    protected void giveNumber(){
        System.out.print("\nGive your choise (number): ");
    }

    protected void chooseOrder(){
        System.out.println("--------------------------");
        System.out.println("Choose order or press zero (0) to return to main menu: ");
    }

}
