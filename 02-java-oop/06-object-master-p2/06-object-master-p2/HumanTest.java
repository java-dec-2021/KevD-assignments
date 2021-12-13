public class HumanTest {
    public static void main(String[] args) {
        Human conan = new Human();
        Human pict = new Human();
        conan.attack(pict);

        Wizard ThulsaDoom = new Wizard();
        Ninja Zoey = new Ninja();
        Samurai Xijon = new Samurai();

        ThulsaDoom.fireball(Zoey);
        Zoey.stealLife(conan);
        Xijon.deathBlow(pict);

    }
}
