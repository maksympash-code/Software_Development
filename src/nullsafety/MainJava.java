package nullsafety;

import scope_functions.Person;

public class MainJava {

    static Person person;

    public static void main(String[] args) {
        person = new Person("Mykola", "Ilchuk", 20);

        // стартує паралельний код, який може зробити щось типу person = null


        // якийсь ще код, який затримує роботу на деякий час, так що паралельний потік встигає змінити person
        if (person != null){
            // паралельний код, person = null
            System.out.println(person.getName()); // може бути креш
        }
    }

}
