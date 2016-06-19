package sinau.module.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sinau.module.hibernate.pojo.Department;
import sinau.module.hibernate.pojo.Employee;

public class OneToMany {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure(
				"/config/hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Department department = new Department();
		department.setId(1);
		department.setDepartment("IT SOLDEV");
		session.save(department);
		
		Employee employee = new Employee();
		employee.setFirstName("Fulan");
		employee.setSalary(10000000);
		employee.setDepartment(department);
		
		department.getEmployees().add(employee);
		
		session.save(employee);

		session.getTransaction().commit();
		sessionFactory.close();

	}

}
