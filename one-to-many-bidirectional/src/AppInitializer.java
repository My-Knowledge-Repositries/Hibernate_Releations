import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;

public class AppInitializer {
    public static void main(String[] args) {
        /*  try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Laptop laptop1 = new Laptop();
            Laptop laptop2 = new Laptop();
            Student student = new Student();
            laptop1.setBrand("Lenovo");
            laptop1.setStudent(student);
            laptop2.setBrand("Mac");
            laptop2.setStudent(student);
            student.setStudentName("Nimal");
            student.setLaptop(Arrays.asList(laptop1,laptop2));
            session.save(student);
            transaction.commit();
        }*/

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Student selectedStudent = session.get(Student.class, (long) 1);
            System.out.println(selectedStudent.getStudentName());
            System.out.println("================");
            selectedStudent.getLaptop().stream().forEach(e-> System.out.println(e.getBrand()));
            System.out.println("================");
        }

    }

}
