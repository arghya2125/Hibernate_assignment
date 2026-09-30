package crud;


import org.arghya.hibernate_assign_1.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class CreateDepartment {
	private SessionFactory sessionFactory;
	public CreateDepartment(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Department department= new Department("ECE");
		session.persist(department);
		
		department=new Department("CSE");
		session.persist(department);
		
		department=new Department("EE");
		session.persist(department);
		
		department=new Department("ME");
		session.persist(department);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Department is created successfully");
		
	}
}
