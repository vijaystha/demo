import config.HibernateConfig;
import model.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        StudentEntity student1= new StudentEntity("Test", "US");
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
    StudentEntity stu= session.get(StudentEntity.class,17);
    StudentEntity stu1= session.load(StudentEntity.class,5);

        session.save(student1);

//        System.out.println(stu.getName());
    transaction.commit();
    sessionFactory.close();
    }
}
