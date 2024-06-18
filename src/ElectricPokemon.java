import java.util.ArrayList;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    private final List<String> attacks;

    public ElectricPokemon(String name, int level, int healthPoints, String food, String speech) {
        super(name, level, healthPoints,"electric",speech, food);
        this.attacks = setAttacks();
    }

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

    private int attackMultiplier(int attack, Pokemon defender) {
        attack = switch (defender.getType()) {
            case "water" -> attack * 2;
            case "grass" -> (int) (attack * 1.5);
            case "fire" -> (int) (attack * 1.1);
            case "electric" -> attack / 2;
            default -> 15;
        };

        return attack;
    }

    private void attackDisplay(Pokemon attacker, Pokemon defender, int damageCount, String attackName) {

        System.out.println(attacker.getName() + " attacks " + defender.getName()
                + " with " + attackName);
        System.out.println(defender.getName() + " loses " + damageCount + "hp");
    }
    public void thunderPunch(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 15;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "thunderpunch");
    }

    public void electroBall(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 18;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "electroball");
    }

    public void thunder(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 30;

        if (defender.getType().equals("electric")) {

            healthpoint = healthpoint + attack;
            defender.setHp(healthpoint);

            System.out.println("provide HP boost on " + defender.getName() + " +" + attack +"hp");
        } else {
            int damageCount = attackMultiplier(attack, defender);

            defender.setHp(healthpoint - damageCount);
            attackDisplay(attacker, defender, damageCount, "thunder");
        }
    }

    public void voltTackle(Pokemon attacker, Pokemon defender) {
        int healthpoint = defender.getHp();
        int attack = 22;
        int damageCount = attackMultiplier(attack, defender);

        defender.setHp(healthpoint - damageCount);
        attackDisplay(attacker, defender, damageCount, "volt tackle");
    }
}
