//import java.util.Random;
import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava gen = new PuzzleJava();

        ArrayList<Integer> randomRolls = gen.getTenRolls();
        System.out.println(randomRolls);

        System.out.println("Random Letter is:" + " " + gen.getRandomLetter());
        System.out.println(gen.generatePassword());
        System.out.println(gen.getPasswords(6));
    }
}
