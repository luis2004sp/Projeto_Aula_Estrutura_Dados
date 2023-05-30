/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistasoperacoes;

/**
 *
 * @author profsl
 */
public class AppListasOperacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 0..N
        int[] v = {1, 2, 3, 6, 7, 8, 9, 10};
        int n = 1;
        int posicao = buscaBinaria(v, n);
        System.out.println("Posição = " + posicao);
    }

    /**
     * Busca um elemento numérico dentro de um vetor v e devolve a sua
     * posição.Caso não encontrado, devolve -1.
     *
     * @param v vetor preenchido.
     * @param valor elemento a ser encontrado.
     * @return a posição encontrada ou -1.
     */
    public static int buscaLinear(int[] v, int valor) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaBinaria(int[] v, int valor) {
        int inicio, fim, pivo;
        inicio = 0;
        fim = v.length - 1;

        while (inicio <= fim) {
            pivo = (inicio + fim) / 2;
            if (v[pivo] == valor) {
                return pivo;
            }
            if (valor > v[pivo]) {
                inicio = pivo + 1;
            }
            if (valor < v[pivo]) {
                fim = pivo - 1;
            }
        }

        return -1;
    }
}
