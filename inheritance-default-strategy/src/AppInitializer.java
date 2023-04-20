import org.hibernate.Session;

public class AppInitializer {
    public static void main(String[] args) {
        try(Session session= HibernateUtil.getSessionFactory().openSession()){

        }
    }

}
