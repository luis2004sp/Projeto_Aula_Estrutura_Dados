/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistacircular;

/**
 *
 * @author profsl
 */
public class ListaCircular {

    private Celula cabeca;
    private Celula cauda;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void adicionaNoFim(int valor) {
        Celula novo = new Celula(valor);
        if (this.cabeca == null) {
            this.cabeca = novo;
            this.cauda = novo;
        } else {
            Celula temp = this.cauda;
            temp.setProximo(novo);
            this.cauda = novo;
        }
        this.cauda.setProximo(this.cabeca);
    }

    public void imprime() {
        if (this.cabeca != null) {
            Celula c = this.cabeca;
            do {
                System.out.println(c.getValor());
                c = c.getProximo();
            } while (c != this.cabeca);
        }
    }
    
    public void remove(int valor){
        // Busca pelo valor dentro da lista
        // e remove a sua célula
    }
    
    public Celula busca(int valor){
        // Busca pelo valor dentro da lista
        // e devolve a célula
        return null; // só para não dar erro de primeira
    }
    
    public void imprimeInversamente(){
        // Imprime começando pela cauda
    }
    
    public void removePrimeiro(){
        // Remove sempre o primeiro elemento da lista
    }    
}
