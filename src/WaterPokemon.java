import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon{
    private final List<String> attacks;

    public WaterPokemon(String name, int level, int healthPoints, String food, String speech) {
        super(name, level, healthPoints,"water",speech, food);
        this.attacks = setAttacks();
    }

    private List<String> setAttacks() {
        List<String> attacks = new ArrayList<>();
        attacks.add("surf");
        attacks.add("hydropump");
        attacks.add("hydrocanon");
        return attacks;
    }
    //needs to be expounded
    public List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon attacker, Pokemon defender) {

    }

    public void hydroPump(Pokemon attacker, Pokemon defender) {
    }

    public void hydroCanon(Pokemon attacker, Pokemon defender) {
    }

    public void rainDance(Pokemon attacker, Pokemon defender) {
        if (defender.getType().equals("electric")) {
            System.out.println("Has no effect on " + defender.getName());
        }

        if (defender.getType().equals("grass")) {
            System.out.println("provides HP boost on " + defender.getName());
        }
    }
}
