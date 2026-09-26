package org.arghya.hibernate_assign1;

import org.arghya.hibernate_assign_1.entity.Department;
import org.arghya.hibernate_assign_1.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import crud.CreateEmployee;
import crud.Read;

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
									.buildSessionFactory(); //returns the object of session factory
        //new CreateEmployee(sessionFactory);
        new Read(sessionFactory);
    }
}
