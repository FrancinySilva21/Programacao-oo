public class DocumentoTexto implements Imprimivel {
    private String titulo;
    private String conteúdo;

    public DocumentoTexto(String titulo, String conteúdo) {
        this.titulo = titulo;
        this.conteúdo = conteúdo;
    }

    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteúdo);
    }
}
