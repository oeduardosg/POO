public class Brinquedo extends Produto {
    
    private int idadeMinima;

    public Brinquedo(String nome, float preco, int idadeMinima) {
        super(nome, preco);
        this.idadeMinima = idadeMinima;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Preço: R$" + getPreco() + " e Idade Mínima Recomendada: " + idadeMinima;
    }

}
