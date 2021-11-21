package main.third.many_to_many;

import main.third.many_to_many.entity.Child;
import main.third.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Section section1 = new Section("Football");
//            Child child1 = new Child("Nikita", 5);
//            Child child2 = new Child("Andrey", 9);
//            Child child3 = new Child("Artur", 7);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.save(section1);

            /********************************** */ //add children and section

//            Child child1 = new Child("Alex", 5);
//            Section section1 = new Section("Dance");
//            Section section2 = new Section("Race");
//            Section section3 = new Section("Run");
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.save(child1);

            /********************************** */ //delete children

            Child child = session.get(Child.class, 4);
            session.delete(child);


            session.getTransaction().commit();
            System.out.println("DONE!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
