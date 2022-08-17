package com.example.demo.runtimeconfig;

import java.lang.reflect.InvocationTargetException;

public class MainRuntimeConfig {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("com.example.demo.runtimeconfig.Pessoa");

        Pessoa p = (Pessoa)  clazz.getDeclaredConstructor().newInstance();
        p.setNome("Giancarlo");
        p.setIdade(19);

        System.out.print(p.getNome());
        System.out.println();
        System.out.print(p.getIdade());
    }

}
