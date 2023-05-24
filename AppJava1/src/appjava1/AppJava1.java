/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava1;

import java.util.Scanner;

/**
 *
 * @author profsl
 */
public class AppJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Comando de saída
        System.out.print("Olá, mundo!");
        System.out.println("Pulooou!");
        System.out.printf("N = %d\n", 100);

        // Comando de entrada
        Scanner input = new Scanner(System.in);
        int n;
        //n = input.nextInt();
        //System.out.println("N do usuário = " + n);

        // Variáveis
        int idade = 18;
        String nome;
        char sexo = 'm';
        float peso;
        double salario;

        nome = "Orlando Junior";

        // Operadores aritméticos
        // + - * / %
        // Operadores relacionais
        // >, <, >=, <=, ==, !=
        // Operadores de atribuição
        // = 
        // Estruturas de decisão
        // If - Else
        n = 200;
        if (n > 50) {
            System.out.println("Maior que 50");
        } else {
            System.out.println("Não é maior que 50");
        }

        // Switch
        char estadoCivil = 's';
        switch (estadoCivil) {
            case 'S':
            case 's':
                System.out.println("Solteiro");
                break;
            case 'c':
            case 'C':
                System.out.println("Casado");
                break;
            default:
                System.out.println("Sem estado civil declarado");
        }

        // Estruturas de repetição
        // For
        for (int i = 0; i < 10; i++) {
            System.out.println("Oi");
        }

        // While (enquanto)
        int i = 0;
        while (i < 10) {
            System.out.println("Oi do while");
            i++;
        }

        // Do... while
        i = 0;
        do {
            System.out.println("Oi do do while");
            i++;
        } while (i < 0);

        // Vetores
        int[] idades = {20, 19, 19, 19};
        System.out.printf("P=0 -> %d", idades[0]);

        int[] idadesDaTurma;
        idadesDaTurma = new int[70];

        for (int j = 0; j < idadesDaTurma.length; j++) {
            System.out.print("Idade: ");
            int idadeDoInfeliz = input.nextInt();
            idadesDaTurma[j] = idadeDoInfeliz;
        }

        // for-each
        for (int id : idadesDaTurma) {
            System.out.println("Idade = " + id);
        }

        // Matrizes
        // ALT + SHIFT + F
        int[][] notas = new int[10][10];
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.printf("Linha = %d\t", j);
                System.out.printf("Coluna = %d\t", k);
                System.out.printf("Valor = %d", notas[j][k]);
            }
        }
    }

}
