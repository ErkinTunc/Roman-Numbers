package org.example;

public class Start {

    // Start class
    public static void main(String[] args) {

        System.out.println("=== Roman Converter ===");

        RomanNumber roman = new RomanNumber("IV");
        System.out.println(roman.getValue());
        System.out.println(roman.getRoman());

    }

}
