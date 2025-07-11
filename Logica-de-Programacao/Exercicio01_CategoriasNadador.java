/*
 * 📌 Exercício 05 – Classificação de Nadadores
 * 
 * Descrição:
 * Elabore um algoritmo que, dada a idade de um nadador (informada pelo teclado), 
 * classifica e imprime a categoria na qual ele se enquadra.
 *
 * Faixas etárias e categorias:
 * - Infantil A: 5 a 7 anos
 * - Infantil B: 8 a 10 anos
 * - Juvenil A: 11 a 13 anos
 * - Juvenil B: 14 a 17 anos
 * - Adulto: 18 anos ou mais
 *
 * O programa deve validar a idade digitada (não aceitar valores menores que 1 ou maiores que 80),
 * permitir múltiplos cadastros, e ao final exibir a média de idades e a quantidade de nadadores por categoria.
 * 
 * 💡 Desenvolvido em Java como parte dos exercícios do curso de Análise e Desenvolvimento de Sistemas (ADS).
 */

import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        Scanner ler = new Scanner(System.in); 
        int idade; 
        int total = 0; 
        int somatorio_idades = 0; 
        int infantilA = 0, infantilB = 0, juvenilA = 0, juvenilB = 0, adulto = 0; 
        double media = 0; 
        char sair; 
        
        do { 
            do { 
                System.out.print("Informe a idade do(a) nadador(a): "); 
                idade = ler.nextInt(); 
            } while (idade <= 0 || idade > 80); 
            
            if (idade >= 5 && idade <= 7) { 
                System.out.print("Categoria: Infantil A"); 
                infantilA++; 
                total++; 
                somatorio_idades += idade; 
            } else if (idade >= 8 && idade <= 10) { 
                System.out.print("Categoria: Infantil B"); 
                infantilB++; 
                total++; 
                somatorio_idades += idade; 
            } else if (idade >= 11 && idade <= 13) { 
                System.out.print("Categoria: Juvenil A"); 
                juvenilA++; 
                total++; 
                somatorio_idades += idade; 
            } else if (idade >= 14 && idade <= 17) { 
                System.out.print("Categoria: Juvenil B"); 
                juvenilB++; 
                total++; 
                somatorio_idades += idade; 
            } else if (idade >= 18) { 
                System.out.print("Categoria: Adulto"); 
                adulto++; 
                total++; 
                somatorio_idades += idade; 
            } else { 
                System.out.print("Categoria: Nenhuma"); 
            } 
            
            do { 
                System.out.printf("\nDeseja sair? 1-Sim, 0-Não.\n"); 
                sair = ler.next().charAt(0); 
            } while (sair != '1' && sair != '0'); 
            
        } while (sair == '0'); 
        
        if (total > 0) { 
            media = (double) somatorio_idades / (double) total; 
        } 
        
        System.out.printf("\n\nResumo da classificação:\n");
        System.out.printf("→ Total de nadadores: %d\n", total); 
        System.out.printf("→ Média de idades: %.2f\n", media); 
        System.out.printf("→ Infantil A: %d\n", infantilA); 
        System.out.printf("→ Infantil B: %d\n", infantilB); 
        System.out.printf("→ Juvenil A: %d\n", juvenilA); 
        System.out.printf("→ Juvenil B: %d\n", juvenilB); 
        System.out.printf("→ Adulto: %d\n", adulto); 
    }
}
