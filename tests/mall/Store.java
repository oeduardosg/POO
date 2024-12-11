public class Store {

    private String name;
    private float income;
    private float outcome;

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getIncome() {
        return income;
    }

    public float getOutcome() {
        return outcome;
    }

    public void addIncome(float value) {
        income += value;
    }

    public void addOutcome(float value) {
        outcome -= value;
    }

    public float getProfit() {
        return income - outcome;
    }

}