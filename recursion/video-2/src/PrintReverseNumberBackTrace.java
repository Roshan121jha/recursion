public class PrintReverseNumberBackTrace {

    public static void main(String[] args) {
        printLinearTillNNumber(1, 5);
    }

    public static void printLinearTillNNumber(int startIndex, int finalIndex) {
      if (startIndex > finalIndex) {
          return;
      }
      printLinearTillNNumber(startIndex+1, finalIndex);
        System.out.println(startIndex);
    }
}
