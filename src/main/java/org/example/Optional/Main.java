package org.example.Optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");

        Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");
        Object value2 = Optional.ofNullable("Hello")
                .orElseThrow(exception);



         Optional.ofNullable(null)
                 .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                         () -> System.out.println("Cannot send"));

    }
}
