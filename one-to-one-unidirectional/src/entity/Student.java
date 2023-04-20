package entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long studentId;
    private String studentName;

    //---------mapping------------------
    @OneToOne
    @JoinColumn(name = "laptop_id")
    private Laptop laptop;
    //---------------------------

    public Student() {
    }

    public Student(long studentId, String studentName, Laptop laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.laptop = laptop;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
