public class App {

    public static void main(String[] args) {
        
        Produto[] produtos = new Produto[5];
        produtos[0] = new Brinquedo("Quebra-Cabeça", 58f, 4);
        produtos[1] = new Livro("Jogos Vorazes", 45f, "Suzanne Collins");
        produtos[2] = new Livro("Harry Potter e a Câmara Secreta", 25.5f, "J. K. Rowling");
        produtos[3] = new Brinquedo("UNO", 9.9f, 7);
        produtos[4] = new Brinquedo("Hotwheels muda de cor na água fria", 500.30f, 21);

    for (Produto p : produtos) {
        System.out.println(p);
    }

    }

}