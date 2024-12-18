package q3;

import java.util.LinkedList;

public class Disciplina {

    private String idDisciplina;
    private String nomeDisciplina;
    private LinkedList<Disciplina> preRequisitos = new LinkedList<Disciplina>();

    public Disciplina(String idDisciplina, String nomeDisciplina) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
    }

    public void addPreRequisito(Disciplina p) {
        preRequisitos.add(p);
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

}
