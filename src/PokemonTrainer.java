import java.util.List;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemon;
    }

    public void setPokemons(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public PokemonTrainer(String name, List<Pokemon> pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }
}
