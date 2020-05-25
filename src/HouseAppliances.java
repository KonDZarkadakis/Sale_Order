

public class HouseAppliances extends Item{

    private String type;
    private String energyClass; //Energy class
    private int keepCapacity; //Keep capacity
    private int refrCapacity; //refrigeration capacity
    private int capacity; //capacity
    private int rpm; //rpm

    //constructor for fridge
    public HouseAppliances(String _generalType, String _code, String _modelName, int _year, String _manufacturer, double _price,
                           String _type, String _energyClass, int _keepCapacity, int _refrCapacity) {
        super(_generalType, _code, _modelName, _year, _manufacturer, _price);
        this.type = _type;
        this.energyClass = _energyClass;
        this.keepCapacity = _keepCapacity;
        this.refrCapacity = _refrCapacity;
    }

    //constructor for washing machines
    public HouseAppliances(String _generalType, String _code, String _modelName, int _year, String _manufacturer, double _price,
                           String _energyClass, int _capacity, int _rpm) {
        super(_generalType, _code, _modelName, _year, _manufacturer, _price);
        this.energyClass = _energyClass;
        this.capacity = _capacity;
        this.rpm = _rpm;
    }


    public String toString(){
        if (generalType.equals("fridge")){
            return "------------------------------" + "\nCode: " + getCode() + ", Model Name: " + getModelName() + ", Model Year: " + getYear() +
                    ", Manufacturer: " + getManufacturer() + ", Price: " + getPrice() +
                    ", Type: " + getType() + ", Energy Class: " + getEnergyClass() +
                    ", Keep Capacity: " + getKeepCapacity() + ", Refrigeration Capacity: " + getRefrCapacity();
        }else {
            return "------------------------------" + "\nCode: " + getCode() + ", Model Name: " + getModelName() + ", Model Year: " + getYear() +
                    ", Manufacturer: " + getManufacturer() + ", Price: " + getPrice() +
                    ", Energy Class: " + getEnergyClass() + ", Capacity: " + getCapacity() + ", Rpm: " + getRpm();
        }
    }


    //getters
    public String getType() {
        return type;
    }
    public String getEnergyClass() {
        return energyClass;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getRpm() {
        return rpm;
    }
    public int getKeepCapacity() {
        return keepCapacity;
    }
    public int getRefrCapacity() {
        return refrCapacity;
    }

    //setters
    public void setType(String type) {
        this.type = type;
    }
    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    public void setKeepCapacity(int keepCapacity) {
        this.keepCapacity = keepCapacity;
    }
    public void setRefrCapacity(int refrCapacity) {
        this.refrCapacity = refrCapacity;
    }
}
