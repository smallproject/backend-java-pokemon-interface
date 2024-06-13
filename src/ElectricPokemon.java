import java.util.List;

public class ElectricPokemon extends Pokemon{
    private List<String> attacks;

    public ElectricPokemon(String name, int temp1, double temp2, String food, String speech) {
        super(name, temp1,speech, food);
    }

    //needs to be expounded
    public List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {

    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
