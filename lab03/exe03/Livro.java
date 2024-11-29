public class Livro extends Produto {
    
    private String autor;

    public Livro(String nome, float preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Preço: R$" + getPreco() + " e Autor: " + autor;
    }

}
