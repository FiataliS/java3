package lesson_6;

public class ArrayLastFour {


    static void nullFourException(int x) throws RuntimeException {
        if (x == 0) {
            throw new RuntimeException();
        }
    }

    public static int[] vs(int... arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {if (arr[i] == 4) {x = i;}}
        nullFourException(x);
        int[] arrayLastFor = new int[arr.length - x-1];
        for (int i = x+1, j=0; i < arr.length; i++,j++) {arrayLastFor[j]=arr[i];}
        return arrayLastFor;
    }



}
