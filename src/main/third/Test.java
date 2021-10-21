package main.third;

import main.third.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Ivan", "Ivanov", "IT", 5000);

            session.beginTransaction(); //создание транзакции
            session.save(employee); //запуск транзакции
            session.getTransaction().commit();  // закрытие транзакции
        } finally {
            factory.close();
        }

    }
}
