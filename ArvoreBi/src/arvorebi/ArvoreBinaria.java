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
public class ArvoreBinaria {

    Celula raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public boolean estaVazia() {
        return this.raiz == null;
    }

    private Celula insere(Celula no, int valor) {
        if (no == null) {
            return new Celula(valor);
        }
        if (valor < no.getValor()) {
            no.setEsquerda(insere(no.getEsquerda(), valor));
        } else {
            no.setDireita(insere(no.getDireita(), valor));
        }
        return no;
    }

    public void insere(int valor) {
        this.raiz = this.insere(this.raiz, valor);
    }

    public void imprimeEmOrdem() {
        this.imprimeEmOrdem(raiz);
        System.out.println("");
    }

    private void imprimeEmOrdem(Celula no) {
        if (no != null) {
            imprimeEmOrdem(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            imprimeEmOrdem(no.getDireita());
        }

    }

    private Celula remove(Celula no, int valor) {
        if (no == null) {
            return null;
        }
        if (valor < no.getValor()) {
            no.setEsquerda(remove(no.getEsquerda(), valor));
        } else if (valor > no.getValor()) {
            no.setDireita(remove(no.getDireita(), valor));
        } else {
            if (no.getEsquerda() == null) {
                return no.getDireita();
            } else if (no.getDireita() == null) {
                return no.getEsquerda();
            }
            Celula aux = getAntecessor(no);
            no.setValor(aux.getValor());
            no.setEsquerda(remove(no.getEsquerda(), aux.getValor()));
        }
        return no;
    }

    public void remove(int valor) {
        this.raiz = this.remove(this.raiz, valor);
    }

    private Celula getAntecessor(Celula no) {
        if (no == null) {
            return null;
        }
        Celula aux = no.getEsquerda();
        while (aux.getDireita() != null) {
            aux = aux.getDireita();
        }
        return aux;
    }

    public boolean busca(int valor) {
        Celula aux = this.busca(this.raiz, valor);
        return aux != null;
    }

    private Celula busca(Celula no, int valor) {
        if (no == null) {
            return null;
        }
        if (valor < no.getValor()) {
            return busca(no.getEsquerda(), valor);
        } else if (valor > no.getValor()) {
            return busca(no.getDireita(), valor);
        }
        return no;
    }

    public void getMenorValor() {
        System.out.println(getMenorValor(raiz).getValor());
    }

    private Celula getMenorValor(Celula no) {

        if (no.getEsquerda() == null) {
            return no;
        }
        no = getMenorValor(no.getEsquerda());

        return no;
    }

    public void getMaiorValor() {
        System.out.println(getMaiorValor(raiz).getValor());
    }

    private Celula getMaiorValor(Celula no) {

        if (no.getDireita() == null) {
            return no;
        }
        no = getMaiorValor(no.getDireita());

        return no;
    }

}
