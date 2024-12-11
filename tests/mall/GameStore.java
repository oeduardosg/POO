public class GameStore extends Store {
    
    private java.util.LinkedList<String> games;
    private java.util.LinkedList<String> clients;
    private float price;
    private int qtt;

    public GameStore(String name, float initialIncome, float price) {
        super(name);
        addIncome(initialIncome);
        this.price = price;
        this.games = new java.util.LinkedList<String>();
        this.clients = new java.util.LinkedList<String>();
    }

    public java.util.LinkedList<String> getGames() {
        return games;
    }

    public java.util.LinkedList<String> getClients() {
        return clients;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void increaseQtt() {
        qtt++;
    }

    public void decreaseQtt() {
        if(qtt > 0) qtt--;
    }

    public void addGames(String games, float price) {
        getGames().add(games);
        addOutcome(price);
    }

    public void sellGames(String games, Costumer client) {
        for(String search: getGames()) {
            if(search == games && client.getMoney() >= getPrice()) {
                addIncome(getPrice());
                getGames().remove(games);
                getClients().add(client.getName());
            }
        }
    }
    
}
