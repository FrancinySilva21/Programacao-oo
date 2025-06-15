import java.util.*;

public class ContatoView {
    public void exibirMenu() {
        System.out.println("===== AGENDA DE CONTATOS =====");
        System.out.println("1. Adicionar");
        System.out.println("2. Listar");
        System.out.println("3. Remover");
        System.out.println("0. Sair");
    }

    public void mostrarContatos(List<Contato> contatos) {
        System.out.println("--- LISTA DE CONTATOS ---");
        for (Contato c : contatos) {
            System.out.println("Nome: " + c.getNome() + ", Tel: " + c.getTelefone() + ", Email: " + c.getEmail());
        }
    }
}
