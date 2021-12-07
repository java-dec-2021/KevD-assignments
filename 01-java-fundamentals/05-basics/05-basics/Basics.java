
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.event.SwingPropertyChangeSupport;
public class Basics {

    public static void main(String[] args) {
        int[] numbers = {2,22,222,3,8};
        int y = 9;
        int[] numbersTwo = {2,22,-2,222,-22,3,9,-11};

        //one255();
        //oneOdd255();
        //returnSum255();
        //arrayOdd();
        //iterateArr(numbers);
        //findMax(numbers);
        //getAverage(numbers);
        //greaterThanY(numbers, y);
        //squareValues(numbers);
        //eliminateNegs(numbersTwo);
        //maxMinAverage(numbers);
        //shiftValues(numbers);

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

    public static void iterateArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void findMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
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

    public static void getAverage(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum  = arr[i] + sum;
        }
            int average = sum/arr.length;
            //System.out.println(sum);
            System.out.println(average);
        }

    public static void greaterThanY(int[] arr, int y) {
        int yPlus = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > y) {
                yPlus ++;
            }
        }
        System.out.println(yPlus);
    }
    
    public static void squareValues(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void eliminateNegs(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void maxMinAverage(int[] arr) {
        int[] MMA = new int[3];

        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        MMA[0] = max;
        }

        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        MMA[1] = min;
    

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum  = arr[i] + sum;
        }
        int average = sum/arr.length;
        MMA[2] = average;
        System.out.println(Arrays.toString(MMA));
    
    }

    public static void shiftValues(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = 0;
                break;
            }
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }

}
