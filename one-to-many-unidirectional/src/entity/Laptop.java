package entity;


import javax.persistence.*;

@Entity(name = "laptop_table")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lap_id")
    private long laptopId;
    private String brand;

    //-------mapping---------
    @OneToOne(mappedBy = "laptop")
    private Student student;
    //-------mapping---------

    public Laptop() {
    }

    public Laptop(long laptopId, String brand, Student student) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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