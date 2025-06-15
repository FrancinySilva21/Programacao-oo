public class ContaPoupanca extends Conta {

    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.0008; // 0.08% ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Poupança - Cliente: " + cliente + ", Saldo: R$" + saldo);
    }
}
