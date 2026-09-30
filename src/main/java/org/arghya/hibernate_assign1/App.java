package org.arghya.hibernate_assign1;

import org.arghya.hibernate_assign_1.entity.Department;
import org.arghya.hibernate_assign_1.entity.Employee;
import org.arghya.hibernate_assign_1.entity.Project;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import crud.CreateDepartment;
import crud.CreateProject;
import crud.DeleteDept;
import crud.DeleteProject;
import crud.ReadDepartment;
import crud.ReadProject;
import crud.UpdateDept;
import crud.UpdateProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.addAnnotatedClass(Department.class)
									.addAnnotatedClass(Project.class)
									.buildSessionFactory(); //returns the object of session factory
        //new CreateDepartment(sessionFactory);
        //new ReadDepartment(sessionFactory);
        //new UpdateDept(sessionFactory);
        //new DeleteDept(sessionFactory);
        //new CreateProject(sessionFactory);
        //new ReadProject(sessionFactory);
        //new UpdateProject(sessionFactory);
        new DeleteProject(sessionFactory);
    }
}
