import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== AGENDA DE CONTATOS =====");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Remover Contato");
            System.out.println("4. Cadastrar Dados de Exemplo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            while (!sc.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                sc.next(); // limpa entrada inválida
            }

            opcao = sc.nextInt();
            sc.nextLine(); // limpa quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Tipo (F para Pessoa Física, J para Jurídica): ");
                    String tipo = sc.nextLine().trim();
                    
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("⚠️ Nome precisa ter no mínimo 3 caracteres.");
                        break;
                    }

                    System.out.print("Telefone: ");
                    String tel = sc.nextLine();
                    
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    if (tipo.equalsIgnoreCase("F")) {
                        System.out.print("CPF (11 dígitos): ");
                        String cpf = sc.nextLine();
                        if (cpf.length() != 11) {
                            System.out.println("⚠️ CPF inválido!");
                            break;
                        }
                        controller.adicionar(new PessoaFisica(nome, tel, email, cpf));
                    } else if (tipo.equalsIgnoreCase("J")) {
                        System.out.print("CNPJ (14 dígitos): ");
                        String cnpj = sc.nextLine();
                        if (cnpj.length() != 14) {
                            System.out.println("⚠️ CNPJ inválido!");
                            break;
                        }
                        controller.adicionar(new PessoaJuridica(nome, tel, email, cnpj));
                    } else {
                        System.out.println("⚠️ Tipo inválido.");
                    }
                }

                case 2 -> view.mostrarContatos(controller.listar());

                case 3 -> {
                    System.out.print("Digite o nome do contato a remover: ");
                    String nome = sc.nextLine();
                    controller.remover(nome);
                }

                case 4 -> {
                    controller.adicionar(new PessoaFisica("Ana", "9999-0001", "ana@email.com", "12345678901"));
                    controller.adicionar(new PessoaJuridica("Empresa X", "8888-0002", "contato@empresa.com", "12345678000199"));
                    System.out.println("Contatos de exemplo cadastrados com sucesso!");
                }

                case 0 -> System.out.println("Encerrando aplicação...");

                default -> System.out.println("⚠️ Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
