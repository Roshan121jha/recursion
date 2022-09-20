public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    public static int fibonacci(int counter) {
        if (counter <= 1){
            return counter;
        }
        return fibonacci(counter - 1) + fibonacci(counter - 2);
    }
}