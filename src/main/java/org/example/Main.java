package org.example;

public class Main {
    public static void main(String[] args) {
        int a0 = 1, a1 = 1;

        System.out.println("WHILE");
        System.out.println("a0 = " + a0 + "\na1 = " + a1);

        int i = 2;
        while(i < 11){
            System.out.println("a" + i + " = " + (a0 + a1));
            a1 = a0 + a1;
            a0 = a1 - a0;
            i++;
        }

        System.out.println("\n\nFOR");
        a0 = 1;
        a1 = 1;
        System.out.println("a0 = " + a0 + "\na1 = " + a1);

        for(i = 2; i < 11; i++){
            System.out.println("a" + i + " = " + (a0 + a1));
            a1 = a0 + a1;
            a0 = a1 - a0;
        }
    }
}