import java.util.ArrayList;
public class Basics {



    public static void One255() {
        for(int i = 0; i < 256; i++)
        System.out.println(i);
    }

    public static void OneOdd255() {
        for(int i = 0; i < 256; i++){
        if(i%2 != 0)
        System.out.println(i);
        }
    }

    public static int OneSum255() {
        int sum = 0;
        for(int i = 0; i < 256; i++) {
            sum += i;
        }
        return sum;
    }

    public static void ArrayIterate(int[] arr) {
        for(int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void FindMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void ArrayOdd() {
        ArrayList<Object> y = new ArrayList<Object>();
        for(int i = 1; i < 256; i += 2) {
            y.add(i);
        }
        System.out.println(y);
    }

}