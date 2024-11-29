public class App {

    public static void main(String[] args) {
        
        Cliente joao = new Cliente("João");
        joao.deposito(1531.56f);
        joao.saque(100f);
        joao.printSaldo();

        ClienteEspecial paulo = new ClienteEspecial("Paulo");
        paulo.deposito(10000f);
        paulo.saque(500f);
        paulo.printSaldo();

    }

}