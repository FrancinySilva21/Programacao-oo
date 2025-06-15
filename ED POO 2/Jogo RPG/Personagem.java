public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome) {
        this.nome = nome;
        this.hp = 100;
        this.ataqueBase = 10;
    }

    public abstract void atacar(Personagem inimigo);

    public void defender(int dano) {
        this.hp -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano!");
    }

    public abstract void usarHabilidadeEspecial(Personagem inimigo);

    public void status() {
        System.out.println(nome + " | HP: " + hp);
    }

    public boolean estaVivo() {
        return hp > 0;
    }
}
