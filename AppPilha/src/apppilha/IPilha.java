package apppilha;

/**
 * Interface IPilha. Interface de classe destinada à implementação da estrutura
 * de dados Pilha.
 */
public interface IPilha {

    /**
     * Método empilha. Este método inclui um novo número inteiro n no topo da
     * pilha. Pré-condições: deve haver espaço na pilha para executar este
     * método. Pós-condições: o número n será o novo topo da pilha.
     *
     * @param n número inteiro a ser incluído na pilha.
     * @throws Exception se a pilha estiver cheia.
     */
    public void empilha(int n) throws Exception;

    /**
     * Método desempilha. Este método remove o topo da pilha e devolve o valor
     * armazenado. Pré-condições: a pilha não pode estar vazia. Pós-condições: o
     * próximo número será o novo topo da pilha.
     *
     * @return número inteiro removido da pilha.
     * @throws Exception se a pilha estiver vazia.
     */
    public int desempilha() throws Exception;
}
