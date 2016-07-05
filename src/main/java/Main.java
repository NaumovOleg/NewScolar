import Createtable_Hibernate.HibernateUtil;
import UserPackage.User;
import Usermassages.Massages;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by олег on 05.07.2016.
 */
public class Main {
    public static void main(String[] args) {

        Session session= (Session) new HibernateUtil().getSessionFactory();
//        session.beginTransaction();
        User user=new User("Oleg" ,"Naumov","password","keeperoleg26");
        Massages massages=new Massages(new Date(System.currentTimeMillis()),user,"odjjebhve");
//        session.save(user);
//        session.save(massages);
//        session.getTransaction().commit();
        session.close();

    }
}
