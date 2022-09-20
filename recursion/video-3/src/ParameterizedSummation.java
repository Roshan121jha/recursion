public class ParameterizedSummation {

    public static void main(String[] args) {
        summation(5, 0);
    }

    public static void summation(int counter, int sum) {
        if (counter < 0) {
            System.out.println(sum);
            return;
        }
        summation(counter-1, sum + counter);
    }
}
