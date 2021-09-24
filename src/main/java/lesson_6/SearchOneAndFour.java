package lesson_6;

public class SearchOneAndFour {

    public static boolean search(int... arr) {
        for (int i = 0; i < arr.length; i++) {if (arr[i] == 4 || arr[i]==1) {return true;}}
        return false;
    }
}
