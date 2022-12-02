import java.util.Scanner;

/**
 * Classe da aplicação que o jogador escolhe com qual símbolo irá jogar
 * @author Giovani Furigo Finazzi
 * @author Felipe da Silva Inácio
 * @since 01/12/2022
 * @version 1.0 Versão Final
 */
public class CriaJogo {
    private Scanner sc = new Scanner(System.in);
    /**
     * Jogador 1
     */
    public static Pessoa p1;
    /**
     * Jogador 2
     */
    public static Pessoa p2;

    /**
     * Construtor que identifica os símbolos dos jogadores
     * @param pess Pessoa
     * @return Símbolo
     */
    public boolean escolheSimbolo(String pess) {
        System.out.println(pess + ", escolha entre O ou X: ");
        try {
            p1.simbolo = sc.nextLine();
            if (p1.simbolo.equals("X")) {
                p1.simbolo = "X";
                p2.simbolo = "O";
            } else {
                if (p1.simbolo.equals("O")) {
                    p1.simbolo = "O";
                    p2.simbolo = "X";
                } else {
                    throw new JogoException("Simbolo invalido.");
                }
            }
        } catch (JogoException se) {
            return false;
        }
        return true;
    }
}
