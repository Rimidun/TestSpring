package main.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

    //@Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }

    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person set pet");
        this.pet = pet;
    }
}
