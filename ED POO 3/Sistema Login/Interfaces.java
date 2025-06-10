// Interface para autenticação
public interface Autenticavel {
    boolean autenticar(String senha);
}

// Interface para gerenciamento de usuários
public interface Gerenciavel {
    void alterarSenha(String novaSenha);
    void bloquearUsuario();
}

// Interface para geração de logs
public interface Logavel {
    void registrarLog(String operacao);
}
