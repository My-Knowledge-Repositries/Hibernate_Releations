package entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal_dis",
        discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "animal_data")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
