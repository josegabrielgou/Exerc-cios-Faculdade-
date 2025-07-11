/*
 * 📌 Exercício 07 – Ordenar Três Números
 * 
 * Descrição:
 * Faça um programa que receba 3 números inteiros e os imprima em ordem crescente.
 * 
 * Exemplo:
 * Entrada: 9 10 3
 * Saída:   3 <= 9 <= 10
 *
 * 💡 Pode-se usar qualquer estrutura condicional (if/else).
 */

import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        Scanner ler = new Scanner(System.in); 
        
        int numero1, numero2, numero3; 
        int maior, menor, meio; 

        System.out.print("Informe o primeiro valor numérico: "); 
        numero1 = ler.nextInt(); 
       
        System.out.print("Informe o segundo valor numérico: "); 
        numero2 = ler.nextInt(); 
       
        System.out.print("Informe o terceiro valor numérico: "); 
        numero3 = ler.nextInt(); 

        // Determinar o maior
        if(numero1 > numero2 && numero1 > numero3){ 
            maior = numero1; 
        } else if(numero2 > numero1 && numero2 > numero3){ 
            maior = numero2; 
        } else { 
            maior = numero3; 
        } 
       
        // Determinar o menor
        if(numero1 < numero2 && numero1 < numero3){ 
            menor = numero1; 
        } else if(numero2 < numero1 && numero2 < numero3){ 
            menor = numero2; 
        } else { 
            menor = numero3; 
        } 
       
        // Determinar o número do meio
        if((numero1 > numero2 && numero1 < numero3) || (numero1 > numero3 && numero1 < numero2)){ 
            meio = numero1; 
        } else if((numero2 > numero1 && numero2 < numero3) || (numero2 > numero3 && numero2 < numero1)) { 
            meio = numero2; 
        } else { 
            meio = numero3; 
        } 

        System.out.printf("\n%d <= %d <= %d\n", menor, meio, maior); 
    }  
}
