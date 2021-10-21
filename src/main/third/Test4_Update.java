package main.third;

import main.third.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4_Update {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();

        session.createQuery("update Employee " + "set salary = '1000' " + "where name = 'Andrey'").executeUpdate();

        session.getTransaction().commit();


        System.out.println("DONE!");

        factory.close();
    }
}