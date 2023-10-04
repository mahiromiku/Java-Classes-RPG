public class Player {
    protected String nome;
    protected Integer level;
    protected Double vida;
    protected Double mana;
    protected Double estamina;

    public Player(String nome, Integer level, Double vida, Double mana, Double estamina) {
        this.nome = nome;
        this.level = level;
        this.vida = vida;
        this.mana = mana;
        this.estamina = estamina;
    }
}

