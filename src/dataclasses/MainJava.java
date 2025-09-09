package dataclasses;

import oop.PersonJava;

public class MainJava {
    public static void main(String[] args) {
        PersonJava person1 = new PersonJava("Andrii", "Krenevych", 20);
        PersonJava person2 = new PersonJava("Andrii", "Krenevych", 20);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }
}
