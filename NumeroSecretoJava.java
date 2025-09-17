
package com.mycompany.numerosecretojava;
import java.util.Scanner;
import java.util.Random;

public class NumeroSecretoJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Achando um número secreto entre 1 e 10 com Random
        Random numeroAleatorio = new Random();
        int numeroSecreto = numeroAleatorio.nextInt(1, 11);
        
        int tentativas = 0;
        int numero = 0;
        
    do{  
        System.out.println("Você consegue achar o número secreto? Digite algum número entre 1 a 10. ");
        try {
        numero = scanner.nextInt(); 
        } catch (Exception e) {
        System.out.println("O número secreto é um número inteiro.");
        scanner.next(); 
        continue;
        }
        
        if(numero > numeroSecreto){
            
            System.out.println("O número secreto é menor.");
            System.out.println("Você errou, tente novamente.");
            
        } else if (numero < numeroSecreto) {
            
            System.out.println("O número secreto é maior.");
            System.out.println("Você errou, tente novamente.");
        }
        
        tentativas++;
        }while(numero != numeroSecreto);
            System.out.println("Você acertou!");

        if (tentativas == 1) { 
        System.out.println("Você achou o número em " + tentativas + " tentativa.");
        
        } else if (tentativas > 1) {
        System.out.println("Você achou o número em " + tentativas + " tentativas.");
        }

    }
}                //Trabalho feito por Marcus V. Marins Alves
