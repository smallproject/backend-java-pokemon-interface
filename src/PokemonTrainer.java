import java.util.List;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemon;
    private List<Food> foods;


    public PokemonTrainer(String name, List<Pokemon> pokemon, List<Food> foods) {
        this.name = name;
        this.pokemon = pokemon;
        this.foods = foods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Food> getFoods() {
        return foods;
    }
}
