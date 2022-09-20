public class ParameterizedFactorial {

    public static void main(String[] args) {
        factorial(5, 1);
    }

    public static void factorial(int counter, int factorial) {
        if (counter < 1) {
            System.out.println(factorial);
            return;
        }
        factorial(counter-1, counter * factorial);
    }
}
