package main.first;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier
@Component("dogBean")
public class Dog implements Pet {


    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow!");
    }
}
