package org.example.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDb.get());

    }

    static String getDBConnectionURL (){
        return "jbdc://localhot:5432/users";
    }

    static Supplier<List<String>> getDb = ()
            ->List.of(
                    "jbdc://localhot:5432/users",
                    "jbdc://localhot:5432/customer"
            ) ;
}
