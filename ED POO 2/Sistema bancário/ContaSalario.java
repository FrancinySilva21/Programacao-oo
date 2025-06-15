public class ContaSalario extends Conta {

    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Salário - Cliente: " + cliente + ", Saldo: R$" + saldo);
    }
}
