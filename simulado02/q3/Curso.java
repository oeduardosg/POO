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

    public String getNome() {
        return nomeCurso;
    }

    public void estabelecePreReq(Disciplina d, String id) {
        d.addPreRequisito(id);   
    }

    @Override
    public String toString() {
        String s = "Curso: " + this.nomeCurso + "\nDisciplinas: \n";
        for(Disciplina d: disciplinas) {
            s += d;
        }
        return s;
    }

}
