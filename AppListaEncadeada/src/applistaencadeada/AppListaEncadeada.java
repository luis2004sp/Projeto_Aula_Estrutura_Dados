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
public class AppListaEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEncadeada lista;
        lista = new ListaEncadeada();

        lista.adicionaNoFim(7);
        lista.adicionaNoFim(10);
        lista.adicionaNoFim(127);

        lista.imprime();

        lista.remove(10);
        System.out.println("---");
        lista.imprime();
    }
}
