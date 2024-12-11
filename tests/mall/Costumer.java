public class Costumer {

    private String name;
    private float money;
    private java.util.LinkedList<String> items;

    public Costumer(String name, float money) {
        this.name = name;
        this.money = money;
        this.items = new java.util.LinkedList<String>();
    }

    public void buy(String item, float price) {
        money -= price;
        items.add(item);
    }

    public String getName() {
        return name;
    }

    public float getMoney() {
        return money;
    }

    public java.util.LinkedList<String> getItems() {
        return items;
    }

}
