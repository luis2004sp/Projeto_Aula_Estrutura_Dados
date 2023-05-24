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
public class Celula {

    private int valor;
    private Celula proximo;

    public Celula() {
    }

    public Celula(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the proximo
     */
    public Celula getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
