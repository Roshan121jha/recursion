public class PrintLinearNumber {

    public static void main(String[] args) {
        printLinearTillNNumber(1, 10);
    }

    public static void printLinearTillNNumber(int startIndex, int finalIndex) {
        System.out.println(startIndex);
        if (startIndex >= finalIndex) {
            return;
        }
        printLinearTillNNumber(startIndex + 1, finalIndex);
    }
}
