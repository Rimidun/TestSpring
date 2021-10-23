package main.third;

import main.third.entity.Details;
import main.third.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        Session session = null;


        try {
            session = factory.getCurrentSession();
            session.beginTransaction();


            //get list value
//            List<Employee> employees = session.createQuery("from Employee")
//                    .getResultList();

//            for(Employee e: employees){
//                System.out.println(e);
//            }

            //add
            Employee emp = new Employee("Igor", "Sovostin", "IT", 2200 );
            Details details = new Details("Kazan", "4254889858", "igor@mail.ru");

            emp.setEmpDetail(details);

            session.save(emp);



            session.getTransaction().commit();
            System.out.println("DONE!");

        } finally {

            factory.close();
        }
    }
}
