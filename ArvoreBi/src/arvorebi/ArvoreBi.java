/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebi;

/**
 *
 * @author 1591622
 */
public class ArvoreBi {

    public static void main(String[] agts) {

        ArvoreBinaria ab = new ArvoreBinaria();

        ab.insere(10);
        ab.insere(20);
        ab.insere(15);
        ab.insere(50);
        ab.insere(5);
        ab.insere(4);
        ab.insere(40);
        ab.imprimeEmOrdem();
        //ab.remove(10);
        //ab.imprimeEmOrdem();

        ab.getMenorValor();
        ab.getMaiorValor();

    }

}
