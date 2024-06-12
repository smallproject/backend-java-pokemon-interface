import java.util.List;

public class PokemonGymOwner {
    private String name;
    private String town;
    private List<Pokemon> pokemonList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public List<Pokemon> getPokemons() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemonList) {
        this.name = name;
        this.town = town;
        this.pokemonList = pokemonList;
    }

}
