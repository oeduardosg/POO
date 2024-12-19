package q3;

import java.util.LinkedList;

public class Universidade {
    
    private String nome;
    private LinkedList<Curso> cursos = new LinkedList<Curso>();

    public Universidade(String nome) {
        this.nome = nome;
    }

    public Curso criaCurso(String nomeCurso) {
        Curso c = new Curso(nomeCurso);
        this.cursos.add(c);
        return c;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String s = "\n\nUniversidade: " + this.nome + "\n";
        for(Curso c: cursos) {
            s += c;
        }
        return s;
    }

}
