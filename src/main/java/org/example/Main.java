package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vova", Gender.MALE),
                new Person("Sasha", Gender.FEMALE),
                new Person("Roma", Gender.MALE),
                new Person("Petja", Gender.MALE),
                new Person("Irina", Gender.FEMALE)
        );


        List<Person> females = new ArrayList<>();

        for (Person person: people){
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female: females){
            System.out.println(female);
        }
        // Declarative appraoch
        System.out.println("Declarative");

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        List<Person> females2 = people.stream()
                 .filter(personPredicate)
                 .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }

     static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

         @Override
         public String toString() {
             return "Person{" +
                     "name='" + name + '\'' +
                     ", gender=" + gender +
                     '}';
         }
     }

    enum Gender {
        MALE, FEMALE
    }
}
