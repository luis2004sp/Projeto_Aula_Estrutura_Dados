/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appoo;

/**
 *
 * @author profsl
 */
public class Obra {

    // Atributos
    String titulo;
    String autor;
    int ano;
    boolean disponivel;

    // Métodos
    public boolean estaDisponivel() {
        return disponivel == true;
    }

    // Encapsulamento
    // Métodos SET (void) / GET (tipo de dado)
    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if (ano > 0 && ano < 3000) {
            this.ano = ano;
        }
    }
}
