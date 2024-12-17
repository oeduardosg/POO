package q1;

public class Departamento implements UnidadeOrganizacional {
    
    private String nome;
    private java.util.LinkedHashSet<Setor> setores;

    public Departamento(String nome) {
        this.nome = nome;
        this.setores = new java.util.LinkedHashSet<Setor>();
    }

    public String getNome() {
        return nome;
    }

    public void addSetor(Setor s) {
        setores.add(s);
    }

    public java.util.LinkedHashSet<Funcionario> getFuncionarios() {
        java.util.LinkedHashSet<Funcionario> copy = new java.util.LinkedHashSet<Funcionario>();
        for(Setor s: setores) {
            copy.addAll(s.getFuncionarios());
        }
        return copy;
    }

    public double getSalarioMedio() {
        int qtdFuncionariosDep = 0;
        double mediaSalarioDep = 0;
        for(Setor s: setores) {
            qtdFuncionariosDep += s.getQtdFuncionarios();
            mediaSalarioDep += s.getSalarioMedio() * s.getQtdFuncionarios();
        }
        return mediaSalarioDep / qtdFuncionariosDep;
    }

}
