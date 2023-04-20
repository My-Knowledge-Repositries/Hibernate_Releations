package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Fish extends Animal{
    private String location;
    private int size;

    public Fish() {
    }

    public Fish(String location, int size) {
        this.location = location;
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
