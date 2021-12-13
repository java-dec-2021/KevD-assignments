public class Wizard extends Human {
    
    public void fireball(Human foe) {
        foe.health -= this.intelligence*3;
        System.out.println("Fireball has reduced the health of your foe to " + foe.health);
    }

    public void heal(Human other) {
        other.health += this.intelligence;
        System.out.println("You healed someone by " + this.intelligence + " life points");
    }
    
    public Wizard() {
        this.intelligence = 8;
        this.health = 50;
    }
}
