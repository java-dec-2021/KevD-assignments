public class Gorilla extends Mammal {
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }
    public void throwItem() {
        System.out.println("Catch this!");
        energyLevel -= 5;
    }
    public void eatBanana() {
        System.out.println("Biting the heck out of bananas over here!");
        energyLevel += 10;
    }
    public void climb() {
        System.out.println("Climbing!");
        energyLevel -= 10;
    }
    
}
