
package ativJava;
import  java.util.Scanner;

public class Buscabinaria {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite as posições do vetor: ");
        int tamanho = tcl.nextInt();
        int vetor[] = new int[tamanho];
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = i;
        }
    int minimo = vetor[0];
    int maximo = vetor.length;
    int media = (minimo+maximo)/2;
    System.out.println("Digite o valor do vetor:");
    int valor = tcl.nextInt();
        if (valor < media) {
            for (int i = 0; i <vetor.length; i++) {
                if (valor == vetor[i]) {
                    System.out.println("O vetor está na posição :  "+ i);
                }
            }
        }
        else if (valor > media){
            for (int i = 0; i < 10; i++) {
                if (valor == vetor[i]) {
                    System.out.println("O vetor está na posição :"+ i);
                }
            } 
        }
        else{
            System.out.println("O vetor está na posição :"+ media);
        }
    }
}
