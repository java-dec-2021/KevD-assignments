public class Ninja extends Human{
    
    public void stealLife(Human foe) {
        foe.health -= this.stealth;
        this.health += this.stealth;
        System.out.println("Life has been stolen from your foe; their health is now " + foe.health + " and yours is " + this.health);
    }

    public void escapeCombat() {
    this.health -= 10;
    System.out.println("You have escaped close combat at the expense of 10 life points; your health is now " + this.health);
    }

    public Ninja(){
        this.stealth = 10;
}
}
