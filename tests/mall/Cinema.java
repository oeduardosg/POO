public class Cinema extends Store {

    private java.util.LinkedList<String> movies;
    private float ticket;
    private float discount;

    public Cinema(String name, float initialIncome, float ticket) {
        super(name);
        addIncome(initialIncome);
        this.ticket = ticket;
        this.movies = new java.util.LinkedList<String>();
    }

    public java.util.LinkedList<String> getMovies() {
        return movies;
    }

    public float getTicket() {
        return ticket;
    }

    public void setTicket(float ticket) {
        this.ticket = ticket;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void sellTicket(int qtt, Costumer client) {
        if(client.getMoney() >= getTicket()) {
            addIncome(qtt * getTicket() * (1 - getDiscount()));
            client.buy("Movie", getTicket());
        }
    }

    public void buyMovie(String movie, float value) {
        this.addOutcome(value);
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        for(String search: this.movies) {
            if(search == movie) this.movies.remove(search);
        }
    }

}