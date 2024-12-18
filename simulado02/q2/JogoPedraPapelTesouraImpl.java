package q2;

import java.util.Random;

public class JogoPedraPapelTesouraImpl implements JogoPedraPapelTesoura {

    private Jogada jogador1;
    private Jogada jogador2;

    public Jogada geraJogada() {

        Random r = new Random();
        int i = r.nextInt(2);
        if(i == 0) {
            return Jogada.PEDRA;
        }
        else if(i == 1) {
            return Jogada.PAPEL;
        }
        else {
            return Jogada.TESOURA;
        }

    }

    public JogoPedraPapelTesouraImpl() {
        
        jogador1 = geraJogada();
        jogador2 = geraJogada();

    }

    public boolean haVencedor() {
        if(this.jogador1 == this.jogador2) {
            return false;
        }
        else {
            return true;
        }
    }

	/**
	 * Retorna a jogada do primeiro jogador.
	 * 
	 * @return jogada escolhida aleatoriamente na construção do objeto
	 */
	public Jogada jogadaJogador1() {
        return jogador1;
    }

	/**
	 * Retorna a jogada do segundo jogador.
	 * 
	 * @return jogada escolhida aleatoriamente na construção do objeto
	 */
	public Jogada jogadaJogador2() {
        return jogador2;
    }

	/**
	 * 
	 * @return 1 ou 2 dependendo do jogador vitorioso.
	 */
	public int getJogadorVencedor() {

        if((jogador1 == Jogada.PEDRA && jogador2 == Jogada.TESOURA) ||
        (jogador1 == Jogada.PAPEL && jogador2 == Jogada.PEDRA) ||
        (jogador1 == Jogada.TESOURA && jogador2 == Jogada.PAPEL)) return 1;
        else return 2;

    }

}