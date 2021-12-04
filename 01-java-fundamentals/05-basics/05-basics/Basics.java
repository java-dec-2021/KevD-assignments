
import java.util.ArrayList;
public class Basics {

    public static void main(String[] args) {
        int[] numbers = {2,22,222,3,8};

        one255();
        oneOdd255();
        returnSum255();
        arrayOdd();
        iterateArr(numbers);
        findMax(numbers);

    }




    public static void one255() {
        for(int i = 0; i < 256; i++)
        System.out.println(i);
    }

    public static void oneOdd255() {
        for(int i = 0; i < 256; i++){
        if(i%2 != 0)
        System.out.println(i);
        }
    }

    public static int returnSum255() {
        int sum = 0;
        for(int i = 0; i < 256; i++) {
            sum += i;
        }
        //System.out.println(sum);
        return sum;
    }

    public static void iterateArr(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void findMax(int[] numbers) {
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }

    public static void arrayOdd() {
        ArrayList<Object> y = new ArrayList<Object>();
        for(int i = 1; i < 256; i += 2) {
            y.add(i);
        }
        System.out.println(y);
    }

}