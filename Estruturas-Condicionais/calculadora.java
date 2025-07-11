/*
 * 📌 Exercício 06 – Calculadora com switch
 *
 * Descrição:
 * Desenvolva um programa que implemente uma calculadora simples com 4 operações:
 * Soma (+), Subtração (-), Multiplicação (*) e Divisão (/).
 * 
 * O programa deve:
 * - Ler dois números
 * - Ler o operador (+, -, *, /)
 * - Usar switch para decidir a operação e imprimir o resultado
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num1, num2, resultado = 0;
        char operador;

        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = ler.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        operador = ler.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }

        ler.close();
    }
}
