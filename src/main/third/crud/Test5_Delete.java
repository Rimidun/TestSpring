package main.third.crud;

import main.third.crud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5_Delete {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration() // создание фабрики сессий
                .configure("hibernate.cfg.xml")  // чтения конфига для подключения к базе
                .addAnnotatedClass(Employee.class)  // из какого класса создаем
                .buildSessionFactory(); // создали

        Session session = factory.getCurrentSession(); // создание текущей сессии, на основе фабрики
        session.beginTransaction(); // начинаем транзакцию на основе сессии
        Employee employee = session.get(Employee.class, 7);  // выбирем объект класса емплои с айди 7
        session.delete(employee); // удаляем этот объект с бд
        session.getTransaction().commit(); // заканчиваем транзакцию

        System.out.println("DONE!");

        factory.close(); // закрываем фабрику сессий
    }
}
