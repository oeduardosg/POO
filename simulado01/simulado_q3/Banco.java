package simulado_q3;

import java.util.LinkedList;

public class Banco {
    
    private String nome;
    private LinkedList<Agencia> agencias = new LinkedList<Agencia>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public Agencia criaAgencia(String nomeAgencia) {
        Agencia a = new Agencia(nomeAgencia);
        agencias.add(a);
        return a;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String s = "Nome do Banco: " + getNome() + "\n";
        for(Agencia a: agencias) {
            s += a + "\n";
        }
        return s;
    }

}
