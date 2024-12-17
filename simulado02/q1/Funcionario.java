package q1;

public class Funcionario {
    
    private String nome;
    private Setor setor;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.setor = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        if(this.setor == null) {
            this.setor = setor;
        }
        else {
            this.setor = null;
            setor.addFuncionario(this);
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
