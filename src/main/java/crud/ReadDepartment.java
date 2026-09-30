package crud;
import java.util.List;

import org.arghya.hibernate_assign_1.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class ReadDepartment {
	
	private SessionFactory sessionFactory;
	public ReadDepartment(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Department> departments=session.createQuery("from Department").getResultList();
		for(Department department:departments) {
			System.out.println(department.toString());
		}
		session.close();
	}
}
