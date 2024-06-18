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

    public List<String> getAttacks() {
        return attacks;
    }

    private int attackMultiplier(int attack, Pokemon defender) {
        attack = switch (defender.getType()) {
            case "electric" -> attack * 2;
            case "fire" -> (int) (attack * 1.5);
            case "water" -> (int) (attack * 1.1);
            case "grass" -> attack / 2;
            default -> 15;
        };

        return attack;
    }

    private void attackDisplay(Pokemon attacker, Pokemon defender, int damageCount, String attackName) {

        System.out.println(attacker.getName() + " attacks " + defender.getName()
                + " with " + attackName);
        System.out.println(defender.getName() + " loses " + damageCount + "hp");
    }

    public void leafStorm(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 19;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "leafstorm");
    }

    public void solarBeam(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 30;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "solarbeam");
    }

    public void leechSeed(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 22;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "leechseed");
    }

    public void leaveBlade(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 15;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "leechseed");
    }
}
