public class Samurai extends Human {
    private static int totalSamurai = 0;
    private static int defaultHealth = 200;

    
    public static int howMany() {
        return Samurai.totalSamurai;
    }

    public void deathBlow(Human foe) {
        foe.health = 0;
        this.health -= this.health/2;
        System.out.println("Death Blow has slain your foe, but left you with a health of " + this.health);
    }

    public void meditate() {
        this.health = Samurai.defaultHealth;
        System.out.println("You have meditated and restored your life force to its full potential");
    }

    public Samurai() {
        this.health = Samurai.defaultHealth;
        Samurai.totalSamurai += 1;

    }
}
