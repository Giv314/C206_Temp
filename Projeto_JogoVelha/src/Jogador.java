/**
 * Classe da aplicação em que o verifica se a posição escolhida pelo jogador é válida
 * @author Giovani Furigo Finazzi
 * @author Felipe da Silva Inácio
 * @since 01/12/2022
 * @version 1.0 versão finalizada
 */
public class Jogador {
    /**
     * Símbolo
     */
    protected String simbolo;

    /**
     * Jogador
     */
    public Jogador() {

    }

    /**
     * Jogar
     * @return -1
     */
    public int jogar(){
        return -1;
    }

    /**
     * Construtor que verifica se a posição já está preenchida
     * @param t tabuleiro
     * @param pos posição
     * @return Posição
     */
    public boolean verificaPosicao(Tabuleiro t, int pos) {
        try {
            if (!t.simbolos.get(pos).equals(" ")) {
                throw new JogoException("Posição já preenchida!");
            }
            return true;
        }catch (JogoException j){
            return false;
        }
    }
}
