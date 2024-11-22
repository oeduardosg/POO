public class Funcionario {

    private String name;
    private float salary;

    public Funcionario(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return this.name;
    }

    public float getSalario() {
        return this.salary;
    }

}