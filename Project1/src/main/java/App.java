import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("starting project...");

        Configuration config = new Configuration();

        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();

        Transaction t = session.beginTransaction();

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Loser");
        employee.setEmail("loser@gmail.com");

        session.save(employee);

        t.commit();
        session.close();

    }
}
