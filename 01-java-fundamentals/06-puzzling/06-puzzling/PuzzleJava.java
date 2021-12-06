import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randomTen = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 1; i <=10; i++) {
            randomTen.add(r.nextInt(20) + 1);
        }
        return randomTen;
    }

    public String getRandomLetter() {
        Random r = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char randomCharacter = alphabetString.charAt(r.nextInt(26));
        
        return String.valueOf(randomCharacter);
        }

    public String generatePassword() {
        String password = "";
        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getPasswords(int length) {
        ArrayList<String> passwords = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwords.add(generatePassword());
        }
        return passwords;

    }


}