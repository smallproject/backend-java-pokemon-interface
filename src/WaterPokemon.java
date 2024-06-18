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
    public List<String> getAttacks() {
        return attacks;
    }

    private int attackMultiplier(int attack, Pokemon defender) {
        attack = switch (defender.getType()) {
            case "fire" -> attack * 2;
            case "electric" -> (int) (attack * 1.5);
            case "grass" -> (int) (attack * 1.1);
            case "water" -> attack / 2;
            default -> 15;
        };

        return attack;
    }

    private void attackDisplay(Pokemon attacker, Pokemon defender, int damageCount, String attackName) {

        System.out.println(attacker.getName() + " attacks " + defender.getName()
                + " with " + attackName);
        System.out.println(defender.getName() + " loses " + damageCount + "hp");
    }

    public void surf(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 15;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "surf");
    }

    public void hydroPump(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 15;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "hydropump");
    }

    public void hydroCanon(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 15;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "hydrocanon");
    }

    public void rainDance(Pokemon attacker, Pokemon defender) {

        int healthpoint = defender.getHp();
        int attack = 15;

        if (defender.getType().equals("electric")) {
            System.out.println("Has no effect on " + defender.getName());
        }

        if (defender.getType().equals("grass")) {
            System.out.println("provide HP boost on " + defender.getName() + " +" + attack +"hp");
        } else {
            int damageCount = attackMultiplier(attack, defender);

            defender.setHp(healthpoint - damageCount);
            attackDisplay(attacker, defender, damageCount, "rainDance");
        }
    }
}
