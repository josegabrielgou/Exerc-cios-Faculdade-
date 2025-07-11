/*
 * 📌 Exercício 03 – Estado Civil
 * 
 * Descrição:
 * Escreva um programa que leia uma letra representando o estado civil de uma pessoa:
 * 
 * s – Solteiro
 * c – Casado
 * v – Viúvo
 * d – Divorciado
 * a – Amizade Colorida
 * u – União Estável
 * 
 * O programa deve exibir o nome completo do estado civil correspondente.
 * Caso a letra informada não esteja na lista, exibir:
 * "Estado civil não informado."
 *
 * 💡 Usar apenas estrutura condicional `if/else if/else`.
 */

import java.util.Scanner;

public class EstadoCivil {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char estado;

        System.out.print("Informe o estado civil (s, c, v, d, a, u): ");
        estado = ler.next().toLowerCase().charAt(0);

        if (estado == 's') {
            System.out.println("Estado civil: SOLTEIRO");
        } else if (estado == 'c') {
            System.out.println("Estado civil: CASADO");
        } else if (estado == 'v') {
            System.out.println("Estado civil: VIÚVO");
        } else if (estado == 'd') {
            System.out.println("Estado civil: DIVORCIADO");
        } else if (estado == 'a') {
            System.out.println("Estado civil: AMIZADE COLORIDA");
        } else if (estado == 'u') {
            System.out.println("Estado civil: UNIÃO ESTÁVEL");
        } else {
            System.out.println("Estado civil não informado.");
        }

        ler.close();
    }
}
