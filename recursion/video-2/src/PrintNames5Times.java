public class PrintNames5Times {

    public static void main(String[] args) {
        printNames(0, 5);
    }

    public static void printNames(int startIndex, int endIndex) {
        System.out.println("roshan");
        if (startIndex > endIndex) {
            return;
        }
        printNames(startIndex + 1, endIndex);
    }
}
