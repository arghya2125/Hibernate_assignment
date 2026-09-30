package crud;

import org.arghya.hibernate_assign_1.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateDept {
	private SessionFactory sessionFactory;

	public UpdateDept(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

		// create the object of the session using the sessionFactory object
		Session session = sessionFactory.getCurrentSession();

		// to work with the session object we have to start the transaction
		session.beginTransaction();

		// find the department which we want to update
		int departmentId = 1;

		Department department = session.get(Department.class, departmentId);

		if (department == null) {
			System.out.println("Sorry Department with id " + departmentId + " not found");
			return;
		}

		// update the department name
		department.setDepartmentName("MBA");

		// commit the transaction
		session.getTransaction().commit();

		// close the session object
		session.close();

		System.out.println("Department is updated successfully");
	}
}
