import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon{
    private final List<String> attacks;

    public FirePokemon(String name, int level, int healthPoints, String food,String sound) {
        super(name, level,healthPoints,"fire",sound, food);
        this.attacks = setAttacks();
    }

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

    private int attackMultiplier(int attack, Pokemon defender) {
        attack = switch (defender.getType()) {
            case "grass" -> attack * 2;
            case "water" -> (int) (attack * 1.5);
            case "electric" -> (int) (attack * 1.1);
            case "fire" -> attack / 2;
            default -> 15;
        };

        return attack;
    }

    private void attackDisplay(Pokemon attacker, Pokemon defender, int damageCount) {

        System.out.println(attacker.getName() + " attacks " + defender.getName()
                + " with thunderpunch");
        System.out.println(defender.getName() + " loses " + damageCount + "hp");
    }

    public void inferno(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 15;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount);
    }

    public void pyroBall(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 18;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount);
    }

    public void fireLash(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 22;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount);
    }

    public void flameThrower(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 30;
        attack = attackMultiplier(attack, defender);

        healthpoint = healthpoint - attack;
        defender.setHp(healthpoint);
    }
}
