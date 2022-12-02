import java.util.ArrayList;

/**
 * Classe da aplicação em que o símbolo do jogador é colocado na posição em que ele escolheu e verifica qual o vencedor do jogo
 * @author Giovani Furigo Finazzi
 * @author Felipe da Silva Inácio
 * @since 01/12/2022
 * @version 1.0 versão finalizada
 */
public class Tabuleiro {
    /**
     * Array de Símbolos
     */
    public ArrayList<String> simbolos = new ArrayList();
    /**
     * Array de Números
     */
    public ArrayList<Integer> numeros = new ArrayList<>();

    /**
     * Construtor que cria um tabuleiro de 3x3
     */
    public void criaTabuleiro(){
        for (int i = 0; i < 9; i++) {
            simbolos.add(" ");
        }
        for (int i = 0; i < 9; i++) {
            numeros.add(0);
        }
    }

    /**
     * Construtor que mostra o tabuleiro
     */
    public void mostraTabuleiro(){
        for (int i = 0; i < 9; i++) {
            System.out.print(simbolos.get(i));
            System.out.print("  ");
            if(i == 2 || i == 5 || i == 8){
                System.out.println("\n");
            }
        }
    }

    /**
     * Construtor que coloca o símbolo na posição
     * @param pos posição escolhida
     * @param tipoJogador qual jogador é
     * @param op simbolo
     */
    public void colocarSimbolo(int pos, int tipoJogador, String op){
        simbolos.set(pos, op);
        numeros.set(pos, tipoJogador);
    }

    /**
     * Construtor que percorre a Array pra colocar o símbolo
     * @return true
     */
    public boolean percorreArray(){
        for (int i = 0; i < simbolos.size(); i++) {
            if(simbolos.get(i).equals(" ")){
                return false;
            }
        }
        return true;
    }

    /**
     * Construtor que verifica o ganhador, varrendo as arrays e somando "pontos" para os jogadores
     * @param pessoa jogador 1
     * @param pessoa2 jogador 2
     * @return ganhador
     */
    public String checar(String pessoa, String pessoa2){
        int soma = 0;

        // linhas
        if(simbolos.get(0).equals(simbolos.get(1)) && simbolos.get(1).equals(simbolos.get(2))){
            if(!(numeros.get(0).equals(0) || numeros.get(1).equals(0) || numeros.get(2).equals(0))){
                soma = numeros.get(0) + numeros.get(1) + numeros.get(2);
            }
        }

        if(simbolos.get(3).equals(simbolos.get(4)) && simbolos.get(4).equals(simbolos.get(5))){
            if(!(numeros.get(3).equals(0) || numeros.get(4).equals(0) || numeros.get(5).equals(0))) {
                soma = numeros.get(3) + numeros.get(4) + numeros.get(5);
            }
        }

        if(simbolos.get(6).equals(simbolos.get(7)) && simbolos.get(7).equals(simbolos.get(8))){
            if(!(numeros.get(6).equals(0) || numeros.get(7).equals(0) || numeros.get(8).equals(0))) {
                soma = numeros.get(6) + numeros.get(7) + numeros.get(8);
            }
        }

        // colunas
        if(simbolos.get(0).equals(simbolos.get(3)) && simbolos.get(3).equals(simbolos.get(6))){
            if(!(numeros.get(0).equals(0) || numeros.get(3).equals(0) || numeros.get(6).equals(0))) {
                soma = numeros.get(0) + numeros.get(3) + numeros.get(6);
            }
        }
        if(simbolos.get(1).equals(simbolos.get(4)) && simbolos.get(4).equals(simbolos.get(7))){
            if(!(numeros.get(1).equals(0) || numeros.get(4).equals(0) || numeros.get(7).equals(0))) {
                soma = numeros.get(1) + numeros.get(4) + numeros.get(7);
            }
        }

        if(simbolos.get(2).equals(simbolos.get(5)) && simbolos.get(5).equals(simbolos.get(8))){
            if(!(numeros.get(2).equals(0) || numeros.get(5).equals(0) || numeros.get(8).equals(0))) {
                soma = numeros.get(2) + numeros.get(5) + numeros.get(8);
            }
        }

        // diagonais
        if(simbolos.get(0).equals(simbolos.get(4)) && simbolos.get(4).equals(simbolos.get(8))){
            if(!(numeros.get(0).equals(0) || numeros.get(4).equals(0) || numeros.get(8).equals(0))) {
                soma = numeros.get(0) + numeros.get(4) + numeros.get(8);
            }
        }
        if(simbolos.get(2).equals(simbolos.get(4)) && simbolos.get(4).equals(simbolos.get(6))){
            if(!(numeros.get(2).equals(0) || numeros.get(4).equals(0) || numeros.get(6).equals(0))) {
                soma = numeros.get(0) + numeros.get(1) + numeros.get(2);
            }
        }

        // verificando soma
        if(soma == 3){
            return pessoa;
        }else{
            if(soma == 6){
                return pessoa2;
            }else{
                if(!percorreArray()) {
                    return "Continuar";
                }
            }
        }
        return "Empate";
    }
}
