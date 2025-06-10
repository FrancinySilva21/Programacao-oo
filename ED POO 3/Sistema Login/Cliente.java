public class Cliente extends Usuario implements Autenticavel {

    public Cliente(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.length() > 6 && this.senha.equals(senha);
    }
}
