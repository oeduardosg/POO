public class Estudante {

    private String cpf;
    private String nome;
    private double nota;
    
    public Estudante(String cpf, String nome, double nota) {

        this.cpf = cpf;
        this.nome = nome;
        this.nota = nota;

    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "NOME: " + this.nome + "; CPF: " + this.cpf + "; NOTA: " + this.nota;
    }


}
