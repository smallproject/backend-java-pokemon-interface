import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private final List<String> attacks;

    public GrassPokemon(String name, int level, int healthPoints, String food, String speech) {
        super(name, level, healthPoints,"grass",speech, food);
        this.attacks = setAttacks();
    }

    private List<String> setAttacks() {
        List<String> attacks = new ArrayList<>();
        attacks.add("leafstorm");
        attacks.add("solarbeam");
        attacks.add("leechseed");
        return attacks;
    }
    //needs to be expounded
    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon attacker, Pokemon defender) {
    }

    public void solarBeam(Pokemon attacker, Pokemon defender) {
    }

    public void leechSeed(Pokemon attacker, Pokemon defender) {
        //this needs more work
    }

    public void leaveBlade(Pokemon attacker, Pokemon defender) {
    }
}
