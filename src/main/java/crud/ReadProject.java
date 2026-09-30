package crud;
import java.util.List;

import org.arghya.hibernate_assign_1.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class ReadProject {
	private SessionFactory sessionFactory;

    public ReadProject(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        // get all the objects from our table for Projects
        List<Project> projects = session.createQuery("from Project").getResultList();

        // read one by one object from the list projects
        for (Project project : projects) {
            System.out.println(project.toString());
        }

        session.close();
    }
}
