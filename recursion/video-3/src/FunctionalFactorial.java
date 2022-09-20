public class FunctionalFactorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int counter) {
        if (counter < 1) {
            return 1;
        }
        return counter * factorial(counter-1);
    }
}
