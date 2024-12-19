package q3;

import java.util.LinkedList;

public class Disciplina {

    private String idDisciplina;
    private String nomeDisciplina;
    private LinkedList<String> preRequisitos = new LinkedList<String>();

    public Disciplina(String idDisciplina, String nomeDisciplina) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
    }

    public void addPreRequisito(String p) {
        preRequisitos.add(p);
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    @Override
    public String toString() {
        String s = this.nomeDisciplina + ", ";
        if(preRequisitos.isEmpty()) {
            s += "sem pré-requisitos\n";
        }
        else {
            s += "pré-requisitos: ";
            for(String p: preRequisitos) {
                s += p;
                if(p != preRequisitos.getLast()) s += ", ";
            }

            s += "\n";
        }
        return s;
    }
}
