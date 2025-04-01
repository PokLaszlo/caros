public class Car {
    private int id;
    private String plate;
    private String brand;
    private int year;
    private double price;
    
    public Car(int id, String plate, String brand, int year, double price) {
        this.id = id;
        this.plate = plate;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    public Car(String plate, String brand, int year, double price) {
        this.plate = plate;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
