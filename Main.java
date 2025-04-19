import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Jogador:");
        String nome= teclado.nextLine();

        Jogador jogador=new Jogador(nome,0,0);
        Jogo jogo= new Jogo(jogador);
        Placar placar=new Placar();

        System.out.println("Adivinhe o numeno entre 1 e 100:");
        
        boolean acertou = false;
        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            int tentativa = teclado.nextInt();

            String resultado = jogo.jogar(tentativa);
            System.out.println(resultado);

            if (resultado.contains("Parabéns")) {
                acertou = true;
            }
        }
        System.out.println("Tentativas: " + jogador.getTentativas());
        System.out.println("Pontuação: " + jogador.getPontuacao());

       
        placar.adicionarJogador(jogador);
        placar.exibirRanking();

        teclado.close();
        
    }

}