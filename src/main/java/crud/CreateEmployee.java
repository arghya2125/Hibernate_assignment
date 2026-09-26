package crud;

import org.arghya.hibernate_assign_1.entity.Department;
import org.arghya.hibernate_assign_1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateEmployee {
	private SessionFactory sessionFactory;
	
	public CreateEmployee(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		//create the object of the session using the sessionFactory object
		Session session=sessionFactory.getCurrentSession();
		//to work with the session object we have to start the transaction
		session.beginTransaction();
		//create the object of the employee and the department
		Department department=new Department("CSE");
		session.persist(department);
		Employee employee=new Employee("emp_2", 51000, department);
		//save the object
		session.persist(employee);
		//2nd entry
		department=new Department("EE");
		session.persist(department);
		employee=new Employee("emp_3", 20000, department);
		//save the object
		session.persist(employee);
		session.getTransaction().commit();
		//close the session object
		session.close(); //detached
		//message
		System.out.println("Employee is created successfully");
	}
}
