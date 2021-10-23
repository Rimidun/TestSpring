package main.third.crud;

import main.third.crud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3_Read {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction(); //создание транзакции

            List<Employee> employees = session.createQuery("from Employee")
                    .getResultList();

//            List<Employee> employees = session.createQuery("from Employee " + "where name = 'Nikolay'" + "AND salary > 5").getResultList(); //Через hql





//            for (Employee e : employees)
//                System.out.println(e);


            session.getTransaction().commit();


            System.out.println("DONE!");


        } finally {
            factory.close();
        }


    }
}
