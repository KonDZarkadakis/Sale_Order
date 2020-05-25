

public class Gaming extends Item{

    private String type;
    private String cpu; //cpu
    private String graphics; //graphics
    private String sound; //sound
    private int capacity; //capacity in Gb

    //constructor for consoles
    public Gaming(String _generalType, String _code, String _modelName, int _year, String _manufacturer, double _price,
                  String _type, String _cpu, String _graphics, String _sound, int _capacity) {
        super(_generalType, _code, _modelName, _year, _manufacturer, _price);
        this.type = _type;
        this.cpu = _cpu;
        this.graphics = _graphics;
        this.sound = _sound;
        this.capacity = _capacity;
    }


    public String toString(){
        return "------------------------------" + "\nCode: " + getCode() + ", Model Name: " + getModelName() + ", Model Year: " + getYear() +
                ", Manufacturer: " + getManufacturer() + ", Price: " + getPrice() +
                ", Type: " + getType() + ", Cpu: " + getCpu() + ", Graphics: " + getGraphics() +
                ", Sound: " + getSound() + ", HDD Capacity: " + getCapacity();
    }


    //getters
    public String getType() {
        return type;
    }
    public String getCpu() {
        return cpu;
    }
    public String getGraphics() {
        return graphics;
    }
    public String getSound() {
        return sound;
    }
    public int getCapacity() {
        return capacity;
    }

    //setters
    public void setType(String type) {
        this.type = type;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
