public abstract class Pokemon {
    private final String name;
    private final int hp;
    private int level;
    private final String food;
    private final String sound;
    private final String type;

    public Pokemon(String name, int level, int healthPoints, String type, String speech, String food) {

        this.name = name;
//        this.type = type;
        this.level = level;
        this.hp = healthPoints;
//        this.type = type;
        this.sound = speech;
        this.food = food;
        this.type = type;
    }

    public String getSound() {
        return sound;
    }
//
//    public void setSound(String sound) {
//        this.sound = sound;

//    }
    public String getFood() {
        return food;
    }
//
//    public void setFood(String food) {
//        this.food = food;

//    }

    public int getLevel() {
        return level;
    }


    public void setLevel(int level) {
        this.level = level;
    }


    public int getHp() {
        return hp;
    }
//    public void setHp(int hp) {
//        this.hp = hp;

//    }

    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;

//    }

//    public void speak(String text) {
//        System.out.println("Pokemon says " + text);
//    }
//    public void eat(String food) {
//        System.out.println("Pokemon eats " + food);
//    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        this.type = type;
//    }

}
