public class PrintFromNTo1 {

    public static void main(String[] args) {
        reverseOrder(0, 5);
    }

    public static void reverseOrder(int startIndex, int endIndex) {
        if (endIndex < startIndex) {
            return;
        }
        System.out.println(endIndex);
        reverseOrder(startIndex, endIndex-1);
    }
}
