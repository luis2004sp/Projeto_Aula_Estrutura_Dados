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
public class AppListaDupla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDupla l = new ListaDupla();
        l.adicionaNoFim(10);
        l.adicionaNoFim(20);
        l.adicionaNoFim(30);
        l.adicionaNoFim(40);
        l.imprime();
        
        l.removeUltimo();
        l.removeUltimo();
        l.imprime();        
    }
}
