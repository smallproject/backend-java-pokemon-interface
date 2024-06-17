import java.util.ArrayList;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    private final List<String> attacks;

    public ElectricPokemon(String name, int level, int healthPoints, String food, String speech) {
        super(name, level, healthPoints,"electric",speech, food);
        this.attacks = setAttacks();
    }

    //needs to be expounded
    private List<String> setAttacks() {
        List<String> attacks = new ArrayList<>();
        attacks.add("thunderpunch");
        attacks.add("electroball");
        attacks.add("thunder");
        return attacks;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon attacker, Pokemon defender) {
    }

    public void electroBall(Pokemon attacker, Pokemon defender) {

    }

    public void thunder(Pokemon attacker, Pokemon defender) {
        if (defender.getType().equals("electric")) {
            System.out.println("provide HP boost on " + defender.getName());
        }
    }

    public void voltTackle(Pokemon attacker, Pokemon defender) {
    }
}
