import entity.Animal;
import entity.Cat;
import entity.Fish;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtil {
    private static StandardServiceRegistry standardServiceRegistry;
    private static SessionFactory sessionFactory;

    static {
        try {
            if (sessionFactory == null) {
                standardServiceRegistry
                        = new StandardServiceRegistryBuilder()
                        .configure()
                        .build();
                MetadataSources metadataSources = new MetadataSources(standardServiceRegistry)
                        .addAnnotatedClass(Animal.class)
                        .addAnnotatedClass(Cat.class)
                        .addAnnotatedClass(Fish.class);
                Metadata metadata = metadataSources.getMetadataBuilder().build();
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            }
        } catch (Exception e) {
            if (standardServiceRegistry != null) {
                StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            }
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
