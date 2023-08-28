import config.HibernateConfig;
import model.StudentEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class MainEntityNativeSQL {


    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction  = session.beginTransaction();

        String nativeSQLQuery = "select * from student";
        SQLQuery query = (SQLQuery) session.createQuery(nativeSQLQuery);
        query.addEntity(StudentEntity.class);
        List list = query.list();

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            StudentEntity stu = (StudentEntity) iterator.next();
            System.out.println(stu.getAddress());


        }


        transaction.commit();
        sessionFactory.close();

    }

}
