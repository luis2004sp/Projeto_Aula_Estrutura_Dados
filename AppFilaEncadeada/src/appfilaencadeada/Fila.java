/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfilaencadeada;

/**
 *
 * @author profsl
 */
public class Fila {

    private int quantidade;
    private Celula inicio;
    private Celula fim;

    public Fila() {
        this.quantidade = 0;
        this.inicio = new Celula();
        this.fim = this.inicio;
    }

    public boolean estaVazia() {
        return (this.quantidade == 0);
    }

    public void enfileira(int valor) {
        this.fim.setProximo(new Celula());
        this.fim = this.fim.getProximo();
        this.fim.setValor(valor);
        this.fim.setProximo(null);
        this.quantidade++;
    }

    public int desenfileira() throws Exception {
        if (!estaVazia()) {
            this.inicio = this.inicio.getProximo();
            this.quantidade--;
            return this.inicio.getValor();
        } else {
            throw new Exception("A fila está vazia.");
        }
    }

}
