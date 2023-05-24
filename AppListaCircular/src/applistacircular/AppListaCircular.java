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
public class AppListaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular l = new ListaCircular();
        l.adicionaNoFim(10);
        l.adicionaNoFim(20);
        l.adicionaNoFim(30);
        l.imprime();
    }
}
