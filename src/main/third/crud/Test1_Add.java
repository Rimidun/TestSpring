package main.third.crud;

import main.third.crud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1_Add {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Nikolay", "Smirnov", "Sale", 7500);

            session.beginTransaction(); //создание транзакции
            session.save(employee); //запуск транзакции
            session.getTransaction().commit();  // закрытие транзакции

            System.out.println(employee);

        } finally {
            factory.close();
        }


    }
}
