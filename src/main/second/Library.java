package main.second;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {


    public void getBook(){
        System.out.println("Мы берем книгу из библиотеки");
    }

    public void returnBook(){
        System.out.println("Мы возвращаем книгу в библиотеку");
    }

    public void addBook(){
        System.out.println("Мы добавляем книгу к библиотеку");
    }

}
