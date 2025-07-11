/*
 * 📌 Exercício 06 – Tabuada Interativa com Repetição
 *
 * Descrição:
 * Desenvolva um programa que permita ao usuário gerar a tabuada de um número
 * inteiro positivo informado via teclado.
 *
 * O usuário deve:
 * - Informar um número inteiro entre 1 e 20;
 * - Escolher até qual multiplicador (de 1 até 100);
 * - O programa deve exibir a tabuada completa no formato: "n x i = resultado";
 * - Após exibir, perguntar se deseja gerar outra tabuada;
 * - Validar entradas para que estejam dentro dos intervalos permitidos.
 *
 * O algoritmo deve utilizar laços de repetição para gerar a tabuada e repetir o processo
 * enquanto o usuário desejar.
 *
 * 💡 Desenvolvido em Java como parte dos exercícios do curso de Análise e Desenvolvimento de Sistemas (ADS).
 */

import java.util.Scanner;

public class Exercicio06_TabuadaInterativa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, limite;
        char repetir;

        do {
            // Validação do número da tabuada
            do {
                System.out.print("Digite um número entre 1 e 20 para ver a tabuada: ");
                numero = input.nextInt();
            } while (numero < 1 || numero > 20);

            // Validação do limite do multiplicador
            do {
                System.out.print("Até qual número deseja multiplicar (1 a 100)? ");
                limite = input.nextInt();
            } while (limite < 1 || limite > 100);

            // Geração da tabuada com laço for
            System.out.printf("\n📌 Tabuada do %d até %d:\n", numero, limite);
            for (int i = 1; i <= limite; i++) {
                System.out.printf("%d x %d = %d\n", numero, i, numero * i);
            }

            // Verificação se o usuário deseja repetir
            do {
                System.out.print("\nDeseja gerar outra tabuada? (s/n): ");
                repetir = input.next().toLowerCase().charAt(0);
            } while (repetir != 's' && repetir != 'n');

            System.out.println("------------------------------------------");

        } while (repetir == 's');

        System.out.println("Programa encerrado. Até a próxima!");
    }
}
