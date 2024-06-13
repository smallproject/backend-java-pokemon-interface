import java.util.List;

public class WaterPokemon extends Pokemon{
    private List<String> attacks;

    public WaterPokemon(String name, int temp1, double temp2, String food, String speech) {
        super(name, temp1,speech, food);
    }

    //needs to be expounded
    public List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {

    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
