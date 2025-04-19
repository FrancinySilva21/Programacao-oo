public class Jogador {    
    private String nome;     
    private int tentativas;        
    private int pontuacao;    

    public Jogador(String nome,int tentativas, int pontuacao){
        this.nome=nome;
        this.tentativas= tentativas;
        this.pontuacao= pontuacao;
    } 
    
    public String getNome() {        
        return nome;    
    }    
        
    public void setNome(String nome) {        
       this.nome = nome;    
    }    
        
    public int getTentativas() {        
       return tentativas;    
    }    
        
    public void setTentativas(int tentativas){        
        this.tentativas= tentativas;    
    }    
        
    public int getPontuacao(){        
        return pontuacao;    
    }    
        
    public void setPontuacao(int pontuacao) {        
        this.pontuacao = pontuacao;    
    }    
        
    public void incrementarTentativas() {        
        this.tentativas++;   
    }    
        
    public void atualizarPontuacao(int valor) {        
        this.pontuacao += valor;    
    }
}