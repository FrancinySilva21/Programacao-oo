import java.util.Random;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome);
        this.ataqueBase = 15;
    }

    @Override
    public void atacar(Personagem inimigo) {
        Random rand = new Random();
        boolean critico = rand.nextInt(100) < 30; // 30% de chance
        int dano = critico ? ataqueBase * 2 : ataqueBase;
        System.out.println(nome + (critico ? " acerta um CRÍTICO!" : " ataca com flecha."));
        inimigo.defender(dano);
    }

    @Override
    public void usarHabilidadeEspecial(Personagem inimigo) {
        System.out.println(nome + " usa Chuva de Flechas!");
        atacar(inimigo);
        atacar(inimigo);
        atacar(inimigo);
    }
}
