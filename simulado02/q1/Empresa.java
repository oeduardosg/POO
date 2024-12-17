package q1;

public class Empresa {

    private String nome;
    private java.util.LinkedList<Departamento> departamentos;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void addDepartamento(Departamento d) {
        departamentos.add(d);
    }

    public String getNome() {
        return nome;
    }

}
