import java.util.Random;

public class Jogo{
    private Jogador jogador;
    private int numeroSecreto;

    public Jogo( Jogador jogador){
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100)+ 1;
    }

    public String jogar(int tentativa) {
        jogador.incrementarTentativas(); 

        if (tentativa == numeroSecreto) {
            int tentativas = jogador.getTentativas();
            int pontuacao = 100 - tentativas * 10;
            
            if (pontuacao < 0) pontuacao = 0; 
    
            jogador.setPontuacao(pontuacao);
            return "Parabéns! Você acertou o número.";
            }   
            else if (tentativa < numeroSecreto) {
            return "O número secreto é maior.";
            }   
            
            else {
            return "O número secreto é menor.";
            }
    }
}