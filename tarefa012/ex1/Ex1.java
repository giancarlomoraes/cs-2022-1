package br.ufg.inf.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;

        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            resultado = dividir(num1, num2);
        }catch (ArithmeticException err){
            throw new ArithmeticException("Divisão por zero não é permitida");
        }catch (InputMismatchException err){
            throw new InputMismatchException("O valor informado não é um número");
        }

        System.out.println("Resultado: " + resultado);
    }

    static int dividir(int num1, int num2) throws ArithmeticException{
        return num1/num2;
    }
}