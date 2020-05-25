
public class Item {

    protected String generalType; //general type, eg: Television, Blue ray/DVD players, cameras, Consoles, Fridges, Washers
    protected String code;
    protected String modelName;
    protected int year;
    protected String manufacturer;
    protected double price;


    //constructor
    public Item(String _generalType, String _code, String _modelName, int _year, String _manufacturer, double _price){
        generalType = _generalType;
        code = _code;
        modelName = _modelName;
        year = _year;
        manufacturer = _manufacturer;
        price = _price;
    }


    //setters
    public void setGeneralType(String generalType) {
        this.generalType = generalType;
    }
    public void setCode(String _code){
        this.code = _code;
    }
    public void setModelName(String _modelName){
        this.modelName = _modelName;
    }
    public void setYear(int _year){
        this.year = _year;
    }
    public void setManufacturer(String _manufacturer){
        this.manufacturer = _manufacturer;
    }
    public void setPrice(double _price) {
        this.price = _price;
    }



    //getters
    public String getGeneralType() {
        return generalType;
    }
    public String getCode() {
        return code;
    }
    public String getModelName() {
        return modelName;
    }
    public int getYear() {
        return year;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public double getPrice() {
        return price;
    }


}
