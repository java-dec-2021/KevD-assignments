public class Human {
    protected int strength;
    protected int intelligence;
    protected int stealth;
    protected int health;

    public void attack(Human foe) {
        foe.health -= this.strength;
        System.out.println("The health of your foe has been reduced to " + foe.health);
}

    public Human() {
        this.strength = 3;
        this.intelligence = 3;
        this.stealth = 3;
        this.health = 100;
}

}