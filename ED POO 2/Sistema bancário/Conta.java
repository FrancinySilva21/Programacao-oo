public abstract class Conta {
    protected String cliente;
    protected double saldo;

    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void imprimirExtrato();
    public abstract void aplicarJurosDiarios();
}
