public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);
        this.ataqueBase = 20;
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca com espada!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        super.defender(danoReduzido);
    }

    @Override
    public void usarHabilidadeEspecial(Personagem inimigo) {
        System.out.println(nome + " usa Golpe Duplo!");
        atacar(inimigo);
        atacar(inimigo);
    }
}
