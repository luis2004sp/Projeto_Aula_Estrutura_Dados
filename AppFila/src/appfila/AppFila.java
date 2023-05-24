/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfila;

/**
 *
 * @author profsl
 */
public class AppFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila f = new Fila(4);
        
        Fila g = new Fila(10);

        try {
            f.enfileira(9);
            f.enfileira(7);
            f.enfileira(4);
            f.enfileira(3);

            int valor = f.desenfileira();
            System.out.println("Valor: " + valor);

            f.enfileira(1000);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
