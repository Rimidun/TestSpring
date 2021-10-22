package main.third.crud;

import main.third.crud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2_Add2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            //Создание работника
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Elena", "Sidorova", "HR", 4000);

            session.beginTransaction(); //создание транзакции
            session.save(employee); //запуск транзакции
            session.getTransaction().commit();  // закрытие транзакции

//            //Вызов этого работника
//            int myId = 1;
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee1 = session.get(Employee.class, myId);
//            session.getTransaction().commit();
//
//            System.out.println(employee1);
//
//            System.out.println("DONE!");



        } finally {
            factory.close();
        }


    }
}
