package de.ait.homework37;

public class MobilePhone {
    public int id;
    public String brand;
    public String model;
    public String operatingSystem;
    public double price;

    @Override
    public String toString() {
        return "MobilePhone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", price=" + price +
                '}';
    }

    public MobilePhone(int id, String brand, String model, String operatingSystem, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}









