/**
 * Classe abstrata que representa um funcionário genérico.
 * Define os atributos e métodos básicos comuns a todos os tipos de funcionários.
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
 * Exibe os dados básicos do funcionário com formatação precisa.
 */
public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Salário Base: " + salarioBase);
}


    /**
     * Método abstrato que calcula o salário final do funcionário.
     *
     */
    public abstract double calcularSalario();
}
