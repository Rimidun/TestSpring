package main.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {


    private Pet pet;
    @Value("Vladi")
    private String surname;
    @Value("46")
    private int age;


//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }

    @Autowired
    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person set pet");
        this.pet = pet;
    }

    public String getSurname() {
        System.out.println("Class Person get surname");
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person set surname");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("Class Person get age");
        return age;
    }


    public void setAge(int age) {
        System.out.println("Class Person set age");
        this.age = age;
    }
}
