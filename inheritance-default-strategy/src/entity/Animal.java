package entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long animalId;
    private String name;
    private String genderType;

    public Animal() {
    }

    public Animal(long animalId, String name, String genderType) {
        this.animalId = animalId;
        this.name = name;
        this.genderType = genderType;
    }

    public long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(long animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenderType() {
        return genderType;
    }

    public void setGenderType(String genderType) {
        this.genderType = genderType;
    }
}