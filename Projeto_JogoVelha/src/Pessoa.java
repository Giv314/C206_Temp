import java.util.Scanner;

/**
 * Classe da aplicação que o jogador escolhe a posição desejada e verifica se a posição é válida
 * @author Giovani Furigo Finazzi
 * @author Felipe da Silva Inácio
 * @since 01/12/2022
 * @version 1.0 versão final
 */
public class Pessoa extends Jogador{
    /**
     * Jogada
     */
    public int jogada;
    /**
     * Nome do Jogador
     */
    public String nome;
    /**
     * Data e Hora
     */
    public String dataHoraAux;

    /**
     * Pessoa
     */
    public Pessoa(){
        super();
    }

    /**
     * Construtor que diz de quem é a vez de jogar
     * @return posição jogada
     */
    @Override
    public int jogar() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Vez de " + nome + ". Entre com um valor de 0-8:");
            jogada = sc.nextInt();
            if (jogada > 8 || jogada < 0) {
                throw new JogoException("Posição Invalida!");
            }else{
                return jogada;
            }
        } catch (Exception p) {
            return -1;
        }
    }

    /**
     * Construtor que verifica a posição escolhida
     * @param t tabuleiro
     * @param pos posição
     */
    @Override
    public boolean verificaPosicao(Tabuleiro t, int pos) {
        return super.verificaPosicao(t, pos);
    }

    /**
     * Construtor que mostra o nome do jogador e a data e hora da jogada
     */
    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Data e hora que ganhou: " + dataHoraAux);
    }
}
