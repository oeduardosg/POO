package q3;

import java.util.LinkedList;

public class Curso {
    
    private String nomeCurso;
    private LinkedList<Disciplina> disciplinas = new LinkedList<Disciplina>();

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Disciplina criaDisciplina(String idDisciplina, String nomeDisciplina) {
        Disciplina d = new Disciplina(idDisciplina, nomeDisciplina);
        disciplinas.add(d);
        return d;
    }

}
