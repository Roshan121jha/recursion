import java.util.Arrays;

public class ParameterizedReverseArray {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        reverseArray(0, 4, new int[]{1, 2, 3, 4, 2});
    }

    private static void reverseArray(int startIndex, int endIndex, int[] array) {
        if (startIndex >= endIndex) {
            System.out.println(Arrays.toString(array));
            return;
        }
        int tmp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = tmp;
        reverseArray(startIndex + 1, endIndex - 1, array);
    }
}