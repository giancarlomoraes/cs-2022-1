package com.example.demo.closure;

public class MainClosure {

    public static void main(String[] args) {

        ClosureInterface closureInterface =  Integer::sum;

        int a = 6;
        int b = 4;

        System.out.println(closureInterface.soma(a, b));
    }

}
