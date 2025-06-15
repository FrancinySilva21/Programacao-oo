public class ContaCorrente extends Conta {

    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.001; // 0.1% ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente - Cliente: " + cliente + ", Saldo: R$" + saldo);
    }
}
