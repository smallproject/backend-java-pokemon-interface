import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon{
    private final List<String> attacks;

    public FirePokemon(String name, int level, int healthPoints, String food,String sound) {
        super(name, level,healthPoints,"fire",sound, food);
        this.attacks = setAttacks();
    }

    //needs to be expounded

    private List<String> setAttacks() {
        List<String> attacks = new ArrayList<>();
        attacks.add("inferno");
        attacks.add("pyroball");
        attacks.add("firelash");
        return attacks;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon attacker, Pokemon defender) {
    }

    public void pyroBall(Pokemon attacker, Pokemon defender) {
    }

    public void fireLash(Pokemon attacker, Pokemon defender) {
    }

    public void flameThrower(Pokemon attacker, Pokemon defender) {
    }
}
