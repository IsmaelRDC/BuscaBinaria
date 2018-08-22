/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binaria;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author IsmaelPC
 */
public class Binaria {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Random alt = new Random();
        int vetor[] =new int[40];
        boolean variavel = false;
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = alt.nextInt(100);
        }
        System.out.println("Informe os números desejados:");
        int valor = tec.nextInt();
        for (int i = 0; i <vetor.length; i++) {
            if(valor == vetor[i]){
                System.out.println("Numero encontrado");
                System.out.println("O valor buscado é" + valor);
                variavel = true;
                break;
            }
        }
        if (variavel == false) {
            System.out.println("Não foi possivel encontrar o número");
        }
    }
}