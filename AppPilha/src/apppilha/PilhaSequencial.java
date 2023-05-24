package apppilha;

public class PilhaSequencial implements IPilha {

    private int quantidade;
    private int TamanhoMaximoDaPilha = 5;
    private int[] lista;

    public PilhaSequencial() {
        this.quantidade = 0;
        this.lista = new int[this.TamanhoMaximoDaPilha];
    }

    @Override
    public void empilha(int n) throws Exception {
        if (!this.estaCheia()) {
            this.lista[this.quantidade] = n;
            this.quantidade++;
        } else {
            throw new Exception("A pilha está cheia");
        }
    }

    @Override
    public int desempilha() throws Exception {
        if (!this.estaVazia()) {
            --this.quantidade;
            return this.lista[this.quantidade];
        } else {
            throw new Exception("A pilha está vazia");
        }
    }

    private boolean estaVazia() {
        return this.quantidade == 0;
    }

    private boolean estaCheia() {
        return this.quantidade == this.TamanhoMaximoDaPilha;
    }
}
