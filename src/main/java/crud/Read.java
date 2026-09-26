package crud;

import java.util.List;

import org.arghya.hibernate_assign_1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Read {
	private SessionFactory sessionFactory;
	public Read(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		//create the object of the session using the sessionFactory object
		Session session=sessionFactory.getCurrentSession();
		//to work with the session object we have to start the transaction
		session.beginTransaction();
		List<Employee> employees=session.createQuery("from Employee").getResultList();
		for(Employee employee: employees) {
			System.out.println(employee.toString());
		}
		session.close(); //detached
	}
}
