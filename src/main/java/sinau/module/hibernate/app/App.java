package sinau.module.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sinau.module.hibernate.pojo.Address;
import sinau.module.hibernate.pojo.Employee;

public class App {
	public static void main(String[] args){
		SessionFactory sessionFactory = new Configuration().configure("/config/hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
 		
		session.beginTransaction();
		
		Address empAddress = new Address();
		empAddress.setCity("Kuningan");
		empAddress.setState("Jakarta Selatan");
		empAddress.setZipcode("12940");
		empAddress.setStreet("Jln. Bahagia Selalu");
		
		Employee employee = new Employee();
		employee.setFirstName("Fajri Fulan");
		employee.setSalary(15000000);
		employee.setAddress(empAddress);
		
		empAddress.setEmployee(employee);
		
		session.save(employee);
		
		session.getTransaction().commit();		
		sessionFactory.close();
		
	}
}
