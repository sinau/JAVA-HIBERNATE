package sinau.module.hibernate.pojo;

import java.util.HashSet;
import java.util.Set;

public class Department {
	private long id;
	private String department;
	private Set<Employee> employees = new HashSet<Employee>(0);
	//setter and getter here
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
