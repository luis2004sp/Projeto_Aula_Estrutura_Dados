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
public class AppFilaEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fila encadeada
        Fila f = new Fila();

        f.enfileira(2);
        f.enfileira(4);
        f.enfileira(6);
        f.enfileira(8);

        try {
            int valor = f.desenfileira();
            System.out.println("Valor = " + valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
