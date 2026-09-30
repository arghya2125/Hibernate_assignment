package crud;
import java.util.Date;

import org.arghya.hibernate_assign_1.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class CreateProject {
	private SessionFactory sessionFactory;

    public CreateProject(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Date startDate = new Date();
        Date endDate = new Date();

        Project project = new Project("DevopsProject", startDate, endDate);

        // save the object
        session.persist(project);
        
        project = new Project("React Project", startDate, endDate);

        // save the object
        session.persist(project);

        // commit
        session.getTransaction().commit();

        // close the session
        session.close();

        System.out.println("Project is inserted successfully");
    }
}
