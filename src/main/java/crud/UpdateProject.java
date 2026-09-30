package crud;
import org.arghya.hibernate_assign_1.entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateProject {
	private SessionFactory sessionFactory;

    public UpdateProject(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        int projectId = 1;

        Project project = session.get(Project.class, projectId);

        if (project == null) {
            System.out.println("Sorry Project with id " + projectId + " not found");
            return;
        }

        project.setProjectName("Java Web Application");

        session.getTransaction().commit();
        session.close();

        System.out.println("Project is updated successfully");
    }
}
