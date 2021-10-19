package main.first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Dog dog = context.getBean("dogBean", Dog.class);
//        Cat cat = context.getBean("catBean", Cat.class);
//        dog.say();
//        cat.say();
          Person person = context.getBean("personBean", Person.class);
          //person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());


          context.close();

    }
}
