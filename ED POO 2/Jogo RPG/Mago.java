public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome);
        this.ataqueBase = 12;
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança feitiço!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void usarHabilidadeEspecial(Personagem inimigo) {
        System.out.println(nome + " usa Bola de Fogo (ataque em área)!");
        inimigo.defender(ataqueBase + 8);
    }
}
