package br.ufg.inf.ex1;

public class MainIterativo {

    public static void main(String args[]) {

        QuickSortIterativo iterativo1 = new QuickSortIterativo();
        QuickSortIterativo iterativo2 = new QuickSortIterativo();
        QuickSortIterativo iterativo3 = new QuickSortIterativo();

        int vetor1[] = new int[100];
        int vetor2[] = new int[1000];
        int vetor3[] = new int[10000];

        long tempo = System.currentTimeMillis();

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = (int) Math.random() * 100;
        }

        iterativo1.quickSort(vetor1, 0, vetor1.length - 1);
        System.out.println("Vetor 1: " + (System.currentTimeMillis() - tempo) + " milissegundos");

        tempo = System.currentTimeMillis();

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = (int) Math.random() * 100;
        }

        iterativo1.quickSort(vetor2, 0, vetor2.length - 1);
        System.out.println("Vetor 2: " + (System.currentTimeMillis() - tempo) + " milissegundos");

        tempo = System.currentTimeMillis();

        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = (int) Math.random() * 100;
        }

        iterativo1.quickSort(vetor3, 0, vetor3.length - 1);
        System.out.println("Vetor 2: " + (System.currentTimeMillis() - tempo) + " milissegundos");
    }

}
