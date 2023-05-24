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
public class AppAlocacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Produto p1 = new Produto("Arroz", 11.98);
        Produto p2 = new Produto("Feijão", 14.99);
        Produto p3 = new Produto("Batata", 2.97);
        Produto p4 = new Produto("Cebola", 1.87);
        /*
        Pedido pd = new Pedido();
        System.out.println(pd.adicionaProduto(p1));
        System.out.println(pd.adicionaProduto(p2));
        System.out.println(pd.adicionaProduto(p3));
        System.out.println(pd.adicionaProduto(p4));
         */
        Celula cabeca = new Celula();
        cabeca.produto = p1;
        cabeca.proxima = new Celula();
        cabeca.proxima.produto = p2;
        cabeca.proxima.proxima = new Celula();
        cabeca.proxima.proxima.produto = p3;
        cabeca.proxima.proxima.proxima = new Celula();
        cabeca.proxima.proxima.proxima.produto = p4;
    }
}
