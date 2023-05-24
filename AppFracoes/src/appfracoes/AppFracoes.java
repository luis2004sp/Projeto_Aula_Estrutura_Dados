/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfracoes;

/**
 *
 * @author profsl
 */
public class AppFracoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fracao f1 = new Fracao(2, 3);
        Fracao f2 = new Fracao(4, 2);
        Fracao f3 = f1.soma(f2);
        System.out.println(f3);
    }
}
