package model;

public class Car {
    private String model;
    private String version;
    private int price;

    public Car() {

    }

    public Car(String model, String version, int price) {
        this.model = model;
        this.version = version;
        this.price = price;
    }

    public void setModel() {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setVersion() {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setPrice() {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
