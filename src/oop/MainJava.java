package oop;

public class MainJava {
    public static void main(String[] args) {
        PersonJava person1 = new PersonJava();
        PersonJava person2 = new PersonJava("Andrii", "Krenevych", 20);

        System.out.println(person1);
        System.out.println(person2);

        Person personKotlin = new Person("Andrii", "Krenevych", 20);
        personKotlin.setName("Hello");
    }
}
