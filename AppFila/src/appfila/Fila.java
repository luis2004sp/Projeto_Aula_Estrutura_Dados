/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfila;

/**
 *
 * @author profsl
 */
public class Fila {

    private int[] lista;
    private int quantidade;
    private int tamanhoMaximo;
    private int inicio, fim;

    /**
     * Inicializa uma fila.
     *
     * @param tamanhoMaximo quantidade máxima de elementos da fila.
     */
    public Fila(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.quantidade = 0;
        this.inicio = 0;
        this.fim = this.tamanhoMaximo - 1;
        this.lista = new int[this.tamanhoMaximo];
    }

    public boolean estaCheia() {
        return (this.quantidade == this.tamanhoMaximo);
    }

    public boolean estaVazia() {
        return (this.quantidade == 0);
    }

    public void enfileira(int valor) throws Exception {
        if (!estaCheia()) {
            this.fim = (this.fim + 1) % this.tamanhoMaximo;
            this.lista[this.fim] = valor;
            this.quantidade++;
        } else {
            throw new Exception("A fila está cheia.");
        }
    }

    public int desenfileira() throws Exception {
        if (!estaVazia()) {
            int valor = this.lista[this.inicio];
            this.inicio = (this.inicio + 1) % tamanhoMaximo;
            this.quantidade--;
            return valor;
        } else {
            throw new Exception("A fila está vazia.");
        }
    }
}
