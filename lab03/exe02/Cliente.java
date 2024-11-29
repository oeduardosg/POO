public class Cliente {
    
    private String nome;
    private float saldo;

    public Cliente(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public void deposito(float valor) {
        this.saldo += valor;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSaldo(float valor) {
        this.saldo = valor;
    }

    public void saque(float valor) {
        if(this.getSaldo() - valor - valor * 0.005f > 0) {
            this.setSaldo(this.getSaldo() - valor - valor * 0.005f);
        }
        else {
            System.out.println("O valor de saque é maior que a quantia disponível.");
        }
    }

    public void printSaldo() {
        System.out.printf("O saldo de %s é R$%.2f\n", getNome(), getSaldo());
    }

}
