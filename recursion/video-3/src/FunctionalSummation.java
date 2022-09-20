public class FunctionalSummation {

    public static void main(String[] args) {
        System.out.println(summation(3));
    }

    public static int summation(int counter) {
        if (counter == 0) {
            return 0;
        }
        return counter + summation(counter-1);
    }
}
