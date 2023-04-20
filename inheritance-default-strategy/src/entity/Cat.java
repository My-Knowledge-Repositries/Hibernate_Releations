package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Cat extends Animal{
    private int legs;

    public Cat() {
    }

    public Cat(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
