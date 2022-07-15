package ru.netology;

public class Main {
    public static void main(String[] atgs){
        Post post = new Post();
        post.name = "иван";
        post.passport= "4444 № 4444444";
        post.patronymic = "Иванович";
        post.phone = "+7(999)999-99-99";
        post.surname = "Иванович";


        post.birthdey = new FormDate();
        post.birthdey.day = "13";
        post.birthdey.month = "6";
        post.birthdey.year = "1999";

    }
}
