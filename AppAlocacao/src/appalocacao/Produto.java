/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appalocacao;

/**
 *
 * @author profsl
 */
public class Produto {

    private String nome;
    private double valor;

    public Produto() {
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.nome + " - R$ " + this.valor;
    }
}
