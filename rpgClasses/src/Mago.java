import java.util.Arrays;

public class Mago extends Player {
    private String[] habilidades;

    public Mago(String nome, Integer level, Double vida, Double mana, Double estamina, String[] habilidades) {
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
        return "Mago{" +
                "habilidades=" + Arrays.toString(habilidades) +
                ", nome='" + nome + '\'' +
                ", level=" + level +
                ", vida=" + vida +
                ", mana=" + mana +
                ", estamina=" + estamina +
                '}';
    }

    public static void main(String[] args) {
        Mago dumbledore = new Mago("dumbledore", 100, 999.9d, 999.9d, 100d, new String[]{"expelliarmus", "alohomora", "avada kedavra", "crucio", "imperio", "expecto pratonum", "lumos", "petrificus totalus"});
        System.out.println(dumbledore);
    }
}
