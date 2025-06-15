public class MainRPG {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Throgall");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        g.status();
        m.status();
        a.status();

        g.atacar(m);
        m.usarHabilidadeEspecial(g);
        a.usarHabilidadeEspecial(g);

        g.status();
        m.status();
        a.status();
    }
}

