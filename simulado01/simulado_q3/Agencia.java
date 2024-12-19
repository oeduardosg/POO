package simulado_q3;

import java.util.LinkedList;

public class Agencia {
    
    private String nome;
    private LinkedList<Conta> contas = new LinkedList<Conta>();

    public Agencia(String nome) {
        this.nome = nome;
    }

    public void adicionaConta(Conta c) {
        contas.add(c);
    }

    public String getNome() {
        return nome;
    }

    public double getSaldoMedio() {
        double saldoMedio = 0;
        for(Conta c: contas) {
            saldoMedio += c.getSaldo();
        }
        return saldoMedio / contas.size();
    }

    @Override
    public String toString() {
        String s = "Agência: " + getNome() + ", saldo médio: " + getSaldoMedio(); 
        return s; 
    }
    
}
