package org.example.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {


        System.out.println(isPhoneNUmberValid("+37126384998"));
        System.out.println(isPhoneNUmberValid("+3712638499"));


        System.out.println("WithPredicate");
        System.out.println(isPhoneNumberValidPredicate.test("+37126384998"));


        System.out.println("Is phone valid and contains number 3 "+
        isPhoneNumberValidPredicate.or(containsNUmber3).test("+37126384998"));


        System.out.println("Is phone valid and contains number 5 "+
                isPhoneNumberValidPredicate.and(containsNUmber5).test("+37126384998"));

        System.out.println(containsNameAndSurname.test("Anzels", "Boris"));

    }

    static boolean isPhoneNUmberValid (String phoneNumber){
        return phoneNumber.startsWith("+371") && phoneNumber.length() == 12;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("+371") && phoneNumber.length() == 12;

    static Predicate<String> containsNUmber3 = phoneNUmber ->
            phoneNUmber.contains("3");

    static Predicate<String> containsNUmber5 = number ->
            number.contains("5");

    static BiPredicate<String, String> containsNameAndSurname = (name, surname )->
            name.startsWith("A") && surname.startsWith("B");


}
