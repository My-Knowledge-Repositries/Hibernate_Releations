import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Student student = session.get(Student.class, (long)1);
            if (null!=student){
                System.out.println(student.getStudentName());
            }
        }

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Laptop laptop = session.get(Laptop.class, (long)1);
            if (null!=laptop){
                System.out.println(laptop.getStudent());
            }
        }

    }

}
