public class ClienteEspecial extends Cliente {
    
    public ClienteEspecial(String nome) {
        super(nome);
    }

    @Override
    public void saque(float valor) {
        if(this.getSaldo() - valor - valor * 0.001f > 0) {
            this.setSaldo(this.getSaldo() - valor - valor * 0.001f);
        }
        else {
            System.out.println("O valor de saque é maior que a quantia disponível.");
        }
    }

}
