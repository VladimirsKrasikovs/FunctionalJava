package Stream;

import org.example.Main;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static Stream.Stream.Gender.*;

public class Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Vova", MALE),
                new Person("Sasha", FEMALE),
                new Person("Roma", MALE),
                new Person("Petja", MALE),
                new Person("Irina", FEMALE)
        );

//         people.stream().
//                map(person -> person.name)
//                 .mapToInt(name ->name.length())
//                 .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        boolean containsOnlyFemales = people.stream().anyMatch(personPredicate);
        //nonMath or Allmatch

        System.out.println(containsOnlyFemales);


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
            MALE, FEMALE;


        }

    }

