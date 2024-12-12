package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    
    private int maxHp;
    private int currentHp;
    private int damage1;
    private int damage2;

    public Pokemon(int maxHp, int damage1, int damage2) {
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.damage1 = damage1;
        this.damage2 = damage2;
    }

    public boolean atacar(Pokemon personagemAtacado) {
        Random r = new Random();
		if(r.nextBoolean()) personagemAtacado.perdeVida(damage1);
        else personagemAtacado.perdeVida(damage2);

        if(personagemAtacado.getPontosVitalidade() == 0) return true;
        else return false;
    }
    
	public void regenera() {
        this.currentHp = maxHp;
    }

	public int getPontosVitalidade() {
        return currentHp;
    }

    private void perdeVida(int dano) {
        this.currentHp -= dano;
        if(this.currentHp < 0) this.currentHp = 0;
    }

}
