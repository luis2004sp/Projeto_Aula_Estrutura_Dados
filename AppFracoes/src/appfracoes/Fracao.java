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
public class Fracao {

    // Atributos
    private int numerador;
    private int denominador;

    // Construtor
    // Porta de entrada da classe/objeto
    private Fracao() {
    }

    // Construtor parametrizado
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Métodos
    public Fracao soma(Fracao f) {
        Fracao f3 = new Fracao();
        f3.denominador = this.denominador * f.denominador;
        f3.numerador = ((f3.denominador / this.denominador) * this.numerador)
                + ((f3.denominador / f.denominador) * f.numerador);
        return f3;
    }

    public Fracao subtrai(Fracao f) {
        // ...
    }

    public Fracao multiplica(Fracao f) {
        // ...
    }

    public Fracao dividi(Fracao f) {
        // ....
    }

    // Sobrescrita de métodos
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
