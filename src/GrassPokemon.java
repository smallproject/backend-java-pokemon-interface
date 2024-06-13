import java.util.List;

public class GrassPokemon extends Pokemon{
    private List<String> attacks;

    public GrassPokemon(String name, int temp1, double temp2, String food, String speech) {
        super(name, temp1,speech, food);
    }

    //needs to be expounded
    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {

    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
