package com.example.demo.generics;

import java.util.*;
public class MainGenerics{
    public static <T> void printArray(T[] elements) {
        Arrays.stream(elements).forEach(System.out::println);
        System.out.println();
    }
    public static void main( String args[] ) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'G', 'I', 'A', 'N', 'C', 'A', 'R', 'L', 'O'};

        System.out.println("Usando o método para printar inteiros");
        printArray(intArray);

        System.out.println( "Usando o método para printar chars" );
        printArray(charArray);
    }
}  