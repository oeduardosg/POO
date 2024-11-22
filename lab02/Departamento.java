public class Departamento {

    private String name;
    private java.util.LinkedList<Funcionario> workers;

    public Departamento(String name) {
        this.name = name;
        this.workers = new java.util.LinkedList<Funcionario>();
    }

    public void addFuncionario(Funcionario f) {
        this.workers.add(f);
    }

    public java.util.LinkedList<Funcionario> getFuncionarios() {
        return this.workers;
    }

    public String getNome() {
        return this.name;
    }

    public float getMediaSalarial() {
        float media = 0;
        int count = 0;
        for(Funcionario i: this.workers) {
            media += i.getSalario();
            count += 1;
        }
        if(count == 0) {
            return 0;
        }
        return media /= count;
    }

}