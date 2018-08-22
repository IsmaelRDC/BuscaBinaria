/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubllesort;
import  java.util.Scanner;
/**
 *
 * @author Roberta
 */
public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner tck = new Scanner(System.in);
        System.out.println("Digite quantas posições o vetor deverá ter: ");
        int tam = tck.nextInt();
        int vetor[] = new int[tam];
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = i;
        }
    int minim = vetor[0];
    int maxim = vetor.length;
    int medio = (minim+maxim/2);
        System.out.println("Digite o valor que deseja encontrar:");
    int valor = tck.nextInt();
        if (valor < medio) {
            for (int i = 0; i <vetor.length; i++) {
                if (valor == vetor[i]) {
                    System.out.println("o vetor se encotra na posição"+ i);
                }
            }
        }
        else if (valor > medio){
            for (int i = 0; i < 10; i++) {
                if (valor == vetor[i]) {
                    System.out.println("o vetor se encontra na posição"+ i);
                }
            } 
        }
        else{
            System.out.println("O vetor se encontra na posição"+ medio);
        }
    }
}
