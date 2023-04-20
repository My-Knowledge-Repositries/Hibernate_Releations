package entity;

import javax.persistence.*;

@Entity(name = "laptop_table")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "lap_id")
    private long laptopId;
    private String brand;

    public Laptop() {
    }

    public Laptop(long laptopId, String brand) {
        this.laptopId = laptopId;
        this.brand = brand;
    }

    public long getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(long laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
