package org.example.Optional;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        Optional<Cat> optionalCat= findCatByName("Fred");

        Cat myCat = optionalCat.orElse(new Cat("Unknown", 0));






    }

    private static Optional<Cat> findCatByName (String name){
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }
}