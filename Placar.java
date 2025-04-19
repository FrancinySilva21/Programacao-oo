import java.util.ArrayList;

public class Placar {
    public void exibirRanking() {
    }
    private ArrayList<Jogador> ranking;
        
    public Placar(){
        ranking = new ArrayList<> ();
    }

    public void adicionarJogador(Jogador j){
        ranking.add(j);
    }

    public void mostrarRanking() {
        System.out.println("==RANKING DOS JOGADORES==");
        for (Jogador j : ranking) {
            System.out.println( "Nome: " + j.getNome() + 
                                " | Pontuação: " + j.getPontuacao() + 
                                " | Tentativas: " + j.getTentativas());
        }
    }
}