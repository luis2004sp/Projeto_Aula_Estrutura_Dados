/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaencadeada;

/**
 *
 * @author profsl
 */
public class ListaEncadeada {

    private Celula cabeca;

    public ListaEncadeada() {
        this.cabeca = null;
    }

    public void adicionaNoFim(int valor) {
        Celula novo = new Celula(valor);
        if (this.cabeca == null) {
            this.cabeca = novo;
        } else {
            Celula ultimo = cabeca;
            while (ultimo.getProximo() != null) {
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(novo);
        }
    } // fecha o método

    public void remove(int valor) {
        if (this.cabeca != null && this.cabeca.getValor() == valor) {
            this.cabeca = this.cabeca.getProximo();
        } else {
            Celula anterior = null;
            Celula proximo = this.cabeca;

            while (proximo != null && proximo.getValor() != valor) {
                anterior = proximo;
                proximo = proximo.getProximo();
            }

            if (proximo != null) {
                anterior.setProximo(proximo.getProximo());
            }
        }
    }

    public void imprime() {
        Celula ultimo = this.cabeca; // inicialização
        while (ultimo != null) { // condição
            System.out.println(ultimo);
            ultimo = ultimo.getProximo(); // incremento
        }
    }

} // fecha a classe
