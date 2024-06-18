public abstract class Pokemon {
    private final String name;
    private int hp;
    private final int level;
    private final String food;
    private final String sound;
    private final String type;

    public Pokemon(String name, int level, int healthPoints, String type, String speech, String food) {

        this.name = name;
        this.level = level;
        this.hp = healthPoints;
        this.sound = speech;
        this.food = food;
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public int getLevel() {
        return level;
    }


    public void setHp(int healthPoints) {
        this.hp = healthPoints;
    }


    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

}
