import entity.Animal;
import entity.Cat;
import entity.Fish;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        try(Session session= HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            Animal animal1 = new Animal();
            animal1.setName("Cat (Name)");
            animal1.setGenderType("Male");

            Animal animal2 = new Animal();
            animal2.setName("Fish (Name)");
            animal2.setGenderType("FeMale");

            session.save(animal1);
            session.save(animal2);

            Cat cat = new Cat();
            cat.setLegs(4);

            session.save(cat);

            Fish fish = new Fish();
            fish.setLocation("Alabama");
            fish.setSize(400);

            session.save(fish);

            transaction.commit();


        }
    }

}
