public class Bat extends Mammal {
    public Bat(int energyLevel) {
        super(energyLevel);
    }

    public void fly() {
        System.out.println("The flapping of preternaturally large wings fills your with dread.");
        this.energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("A large portion of your companion's torso is torn out by the winged monstrosity!");
        this.energyLevel += 25;
    }
    
    public void attackTown() {
        System.out.println("Flames consume the town as the giant bat rampages!");
        this.energyLevel -= 100;
    }
    
}
