import java.util.*;

public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato) {
        contatos.add(contato);
    }

    public void remover(String nome) {
        contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    public List<Contato> listar() {
        return contatos;
    }
}
