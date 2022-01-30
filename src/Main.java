public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Luciano");

        Cliente c2 = new Cliente();
        c2.setNome("Barbara");


        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c2);

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
