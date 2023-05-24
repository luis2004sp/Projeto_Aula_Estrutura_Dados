package appbibliotecaoo;

/**
 *
 * @author profsl
 */
public class DVD implements IProduto {

    private String titulo;
    private int ano;
    private int duracaoEmMinutos;

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
        if (ano > 1900) {
            this.ano = ano;
        } else {
            this.ano = 1900;
        }
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
