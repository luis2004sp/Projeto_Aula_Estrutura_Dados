package appbibliotecaoo;

/**
 *
 * @author profsl
 */
public class Livro implements IProduto {

    private String titulo;
    private int ano;
    private int numeroDePaginas;

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int getAno() {
        return this.ano;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

}
