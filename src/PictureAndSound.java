
public class PictureAndSound extends Item{

    private String type;
    private int dimension; //monitor dimensions inches
    private String resolution; //monitor resolution: DV - 720p - 1080p - 2K - 4K
    private String port; //ports: HDMI - DVI - Composite
    private String format; //format : BD-R, BDRD, DVD-RW, DVD+RW
    private String megapixel; //camera megapixel
    private String opticalZoom; //optical zoom
    private String digitalZoom; //digital zoom



    //constructor for television
    public PictureAndSound(String _generalType, String _code, String _modelName, int _year, String _manufacturer, double _price,
                           String _type, int _dimension, String _resolution, String _port) {
        super(_generalType, _code, _modelName, _year, _manufacturer, _price);
        this.type = _type;
        this.dimension = _dimension;
        this.resolution = _resolution;
        this.port = _port;
    }

    //constructor for Blue ray/DVD players
    public PictureAndSound(String _generalType, String _code, String _modelName, int _year, String _manufacturer, double _price,
                           String _type, String _resolution, String _format) {
        super(_generalType, _code, _modelName, _year, _manufacturer, _price);
        this.type = _type;
        this.resolution = _resolution;
        this.format = _format;
    }

    //constructor for cameras
    public PictureAndSound(String _generalType, String _code, String _modelName, int _year, String _manufacturer, double _price,
                           String _type, String _megapixel, String _opticalZoom, String _digitalZoom, int _dimension) {
        super(_generalType, _code, _modelName, _year, _manufacturer, _price);
        this.type = _type;
        this.megapixel = _megapixel;
        this.opticalZoom = _opticalZoom;
        this.digitalZoom = _digitalZoom;
        this.dimension = _dimension;
    }


    public String toString(){
        if (generalType.equals("television")){
            return "------------------------------" + "\nCode: " + getCode() + ", Model Name: " + getModelName() + ", Model Year: " + getYear() +
                    ", Manufacturer: " + getManufacturer() + ", Price: " + getPrice() +
                    ", Type: " + getType() + ", Monitor Dimension: " + getDimension() + ", Monitor Resolution: " + getResolution() + ", Ports: " + getPort();
        }else if (generalType.equals("BD/DVD")){
            return "------------------------------" + "\nCode: " + getCode() + ", Model Name: " + getModelName() + ", Model Year: " + getYear() +
                    ", Manufacturer: " + getManufacturer() + ", Price: " + getPrice() +
                    ", Type: " + getType() + ", Resolution: " + getResolution() + ", Format: " + getFormat();
        }else {
            return "------------------------------" + "\nCode: " + getCode() + ", Model Name: " + getModelName() + ", Model Year: " + getYear() +
                    ", Manufacturer: " + getManufacturer() + ", Price: " + getPrice() +
                    ", Type: " + getType() + ", Megapixel: " + getMegapixel() + ", Optical zoom: " + getOpticalZoom() + ", Digital zoom: " + getDigitalZoom() +
                    ", Monitor size: " + getDimension();
        }
    }


    //getters
    public String getType() {
        return type;
    }
    private int getDimension() {
        return dimension;
    }
    private String getResolution() {
        return resolution;
    }
    private String getPort() {
        return port;
    }
    public String getFormat() {
        return format;
    }
    public String getMegapixel() {
        return megapixel;
    }
    public String getOpticalZoom() {
        return opticalZoom;
    }
    public String getDigitalZoom() {
        return digitalZoom;
    }


    //setters
    public void setType(String type) {
        this.type = type;
    }
    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public void setPort(String port) {
        this.port = port;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public void setMegapixel(String megapixel) {
        this.megapixel = megapixel;
    }
    public void setOpticalZoom(String opticalZoom) {
        this.opticalZoom = opticalZoom;
    }
    public void setDigitalZoom(String digitalZoom) {
        this.digitalZoom = digitalZoom;
    }
}
