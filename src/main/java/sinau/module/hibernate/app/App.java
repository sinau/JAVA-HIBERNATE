package sinau.module.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sinau.module.hibernate.pojo.Employee;

public class App {
	public static void main(String[] args){
		SessionFactory sessionFactory = new Configuration().configure("/config/hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
 		
		session.beginTransaction();
		Employee employee = new Employee();
		employee.setFirstName("Fajri Rahmat");
		employee.setSalary(13000000);
		session.save(employee);
		session.getTransaction().commit();
		
		

		
		sessionFactory.close();
		
	}
}
