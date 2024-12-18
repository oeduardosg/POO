package q1;

public class Setor implements UnidadeOrganizacional {
    
    private String nome;
    private java.util.LinkedHashSet<Funcionario> funcionarios;

    public Setor(String nome) {
        this.nome = nome;
        this.funcionarios = new java.util.LinkedHashSet<Funcionario>();
    }

    public String getNome() {
        return nome;
    }

    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
        f.setSetor(this);
    }

    public void trocaDeSetor(Funcionario f) {
        funcionarios.remove(f);
    }

    public double getSalarioMedio() {
        double salarioMedio = 0;
        for(Funcionario f: funcionarios) {
            salarioMedio += f.getSalario();
        }
        return salarioMedio / funcionarios.size();
    }

    public java.util.LinkedHashSet<Funcionario> getFuncionarios() {
        java.util.LinkedHashSet<Funcionario> copy = new java.util.LinkedHashSet<Funcionario>(funcionarios);
        return copy;
    }

    public int getQtdFuncionarios() {
        return funcionarios.size();
    }

}
