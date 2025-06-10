/**
 * Classe que representa um funcionário temporário.
 * Este tipo de funcionário tem um desconto fixo de R$100,00.
 */
public class FuncionarioTemporario extends Funcionario {
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final do funcionário temporário.
     * Subtrai um valor fixo de R$100,00 do salário base.
     */
    @Override
    public double calcularSalario() {
        return salarioBase - 100.0;
    }
}
