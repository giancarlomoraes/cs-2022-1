package br.ufg.inf.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int i = 0;

        while(true) {
            try {
                int num = sc.nextInt();
                insereVetor(num, vetor, i);
                vetor[i] = num;
                if (num == 0) {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException err) {
                throw new ArrayIndexOutOfBoundsException("Tamanho do vetor excedido");
            } catch (InputMismatchException err) {
                throw new InputMismatchException("O valor informado não é um número");
            } finally {
                i++;
            }
        }
        for (int valor : vetor) {
            if(valor != 0){
                System.out.println(valor);
            }
        }
    }

    static void insereVetor(int num, int vetor[], int i) throws ArrayIndexOutOfBoundsException{
        vetor[i] = num;
    }

}
