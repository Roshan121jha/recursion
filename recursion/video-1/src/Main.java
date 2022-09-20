public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        final int counter = 0;
        f(counter);
    }

    public static void f(int counter) {
        if (counter == 4) {
            return;
        }
        System.out.println("function f");
        counter ++;
        f(counter);
    }
}