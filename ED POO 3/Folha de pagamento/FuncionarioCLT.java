/**
 * Classe que representa um funcionário CLT.
 * Este tipo de funcionário recebe um adicional fixo de R$300,00.
 */
public class FuncionarioCLT extends Funcionario {
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final do funcionário CLT.
     * Adiciona um valor fixo de R$300,00 ao salário base.
     *
     */
    @Override
    public double calcularSalario() {
        return salarioBase + 300.0;
    }
}
