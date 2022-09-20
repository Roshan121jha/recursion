public class PrintLinearNumberBackTrace {

    public static void main(String[] args) {
        printLinearTillNNumber(1, 5);
    }

    public static void printLinearTillNNumber(int startIndex, int finalIndex) {
      if (finalIndex < startIndex) {
          return;
      }
      printLinearTillNNumber(startIndex, finalIndex-1);
        System.out.println(finalIndex);
    }
}
