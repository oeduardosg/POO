public class ArtStore extends Store {
    
    private java.util.LinkedList<String> paintings;
    private java.util.LinkedList<String> clients;
    private float price;
    private int qtt;

    public ArtStore(String name, float initialIncome, float price) {
        super(name);
        addIncome(initialIncome);
        this.price = price;
        this.paintings = new java.util.LinkedList<String>();
        this.clients = new java.util.LinkedList<String>();
    }

    public java.util.LinkedList<String> getPaintings() {
        return paintings;
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

    public void addPainting(String painting, float price) {
        getPaintings().add(painting);
        addOutcome(price);
    }

    public void sellPainting(String painting, Costumer client) {
        for(String search: getPaintings()) {
            if(search == painting && client.getMoney() >= getPrice()) {
                addIncome(getPrice());
                getPaintings().remove(painting);
                getClients().add(client.getName());
            }
        }
    }

}
