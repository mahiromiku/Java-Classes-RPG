import java.util.Arrays;

public class Guerreiro extends Player{
    private String[] habilidades;

    public Guerreiro(String nome, Integer level, Double vida, Double mana, Double estamina, String[] habilidades) {
        super(nome, level, vida, mana, estamina);
        this.habilidades = habilidades;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "habilidades=" + Arrays.toString(habilidades) +
                ", nome='" + nome + '\'' +
                ", level=" + level +
                ", vida=" + vida +
                ", mana=" + mana +
                ", estamina=" + estamina +
                '}';
    }

    public static void main(String[] args) {
        Guerreiro Guts = new Guerreiro("Guts", 35, 550.56d, 0d, 500.56d, new String[]{"modo berserk", "espadada", "canhão de mão"});
        System.out.println(Guts);
    }
}
