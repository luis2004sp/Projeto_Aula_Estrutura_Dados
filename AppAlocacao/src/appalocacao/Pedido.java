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
public class Pedido {

    private int quantidade;
    private int quantidadeMaxima;
    private double valorTotal;
    private Produto[] listaProdutos;

    public Pedido() {
        this.quantidade = 0;
        this.quantidadeMaxima = 3;
        this.listaProdutos = new Produto[this.quantidadeMaxima];
    }

    public boolean adicionaProduto(Produto p) {
        if (this.quantidade == this.quantidadeMaxima) {
            this.expandeVetor();
            //return false;
        }
        this.listaProdutos[this.quantidade] = p;
        this.quantidade++;
        return true;
    }

    private void expandeVetor() {
        // 1. Criar o vetor w
        this.quantidadeMaxima = 2 * this.quantidadeMaxima;
        Produto[] w = new Produto[this.quantidadeMaxima];
        // 2. Copiar o antigo vetor para w
        for (int i = 0; i < this.quantidade; i++) {
            w[i] = listaProdutos[i];
        }
        // 3. Substituir o antigo vetor por w
        this.listaProdutos = w;
    }
}
