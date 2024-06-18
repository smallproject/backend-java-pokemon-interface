import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Deze 4 constanten worden gebruikt om tekst met kleur te printen in de console.
    // Hier hoef je niks mee te doen
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    // Dit zijn de Pokemons die je tot je beschikking hebt
    private static final FirePokemon charizard = new FirePokemon("Charrizard", 76, 150, "firenougats", "GRRRRRRRRRRRRRRR");
    private static final WaterPokemon blastoise = new WaterPokemon("Blastoise", 40, 110, "Pokeflakes", "Blaaaaasssssstooooiiiiissss");
    private static final GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "Pokeleafs", "Veeeeeeeeennnnnuuuuuusaur");
    private static final GrassPokemon ditto = new GrassPokemon("Ditto", 60, 140, "Everything", "Dittto diiiito ");
    private static final ElectricPokemon raichu = new ElectricPokemon("Raichu", 80, 160, "Pokebrocks", "Raaaaiiiiicccchhhhuuuuuuu!!!!");
    private static final WaterPokemon gyarados = new WaterPokemon("Gyarados", 90, 180, "Pokeflakes", "Gyaaaaaaaaarrrraaaadoooos");

    private static List<Pokemon> pokemons = Arrays.asList(charizard, blastoise, venusaur, ditto, raichu, gyarados);

    private static final Food apple = new Food("apple", 20);
    private static final Food banana = new Food("Banana", 20);
    private static final Food pear = new Food("Pear", 20);
    private static final Food candy = new Food("Candy", 40);
    private static final Food meat = new Food("Meat", 50);
    private static final Food halfRestore = new Food("halfRestore", 50);
    private static final Food fullRestore = new Food("fullRestore", 100);

    private static List<Food> foods = Arrays.asList(apple, banana, pear, candy, meat,halfRestore, fullRestore);

    // Los in de main methode alle foutmeldigen op door (abstracte) klassen met variabelen en methoden te maken (en soms een import).
    // In de main methode en de Main klasse hoef je niks te veranderen.
    public static void main(String[] args) {
        Scanner speler_A = new Scanner(System.in);
        PokemonGymImpl pokemonGym = new PokemonGymImpl(pokemons);
        System.out.println("First player please enter your name: ");
        String userA = speler_A.nextLine();
        PokemonTrainer player1 = new PokemonTrainer(userA, pokemons, foods);
        System.out.println("To start your game, we have given you 6 Pokemons to use");
        System.out.println("these are the Pokemons you get:");
        pokemonGym.printPokemon(pokemons);
        System.out.println("Would you like to enter a gym looking for a fight?");
        System.out.println("Please enter yes or no");
        if (speler_A.nextLine().equals("yes")) {
            pokemonGym.enteredTheGym(player1);
        }

    }


}
