/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistadupla;

/**
 *
 * @author profsl
 */
public class ListaDupla {

    private Celula cabeca;

    public ListaDupla() {
        this.cabeca = null;
    }

    public void adicionaNoFim(int valor) {
        Celula novo = new Celula(valor);
        if (this.cabeca == null) {
            this.cabeca = novo;
        } else {
            Celula ultimo = this.cabeca;
            while (ultimo.getProximo() != null) {
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
        }
    }

    public void removeUltimo() {
        if (this.cabeca != null) {
            if (this.cabeca.getProximo() == null) {
                this.cabeca = null;
            } else {
                Celula ultimo = this.cabeca;
                while (ultimo.getProximo() != null) {
                    ultimo = ultimo.getProximo();
                }
                Celula anterior = ultimo.getAnterior();
                anterior.setProximo(ultimo.getProximo());
            }
        }
    }
    
    public void removeDaPosicao(int k){
        
    }
    
    public void adicionaNoComeco(int valor){
        
    }
    
    public void removePenultimo(){
        
    }
    
    public void imprime(){
        // Inicialização ; Condição ; Incremento/Decremento
        for (Celula c = this.cabeca; c != null; c = c.getProximo()) {
            System.out.print(c);
            System.out.print(" ");
        }
        System.out.println();
    }
}
