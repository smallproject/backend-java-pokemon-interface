public abstract class Pokemon {
    public String name;

    public Pokemon(String name, String speech, String food) {
        this.name = name;
    }

    public void speak(String text) {
        System.out.println("Pokemon says " + text);
    }
    public void eat(String food) {
        System.out.println("Pokemon eats " + food);
    }

}
