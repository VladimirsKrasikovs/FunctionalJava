package org.example;

import java.util.Scanner;

public class ShortIfStatment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int maxsum = (a>b && b>c ? a+b : c+b);
        System.out.println(maxsum);

    }
}
