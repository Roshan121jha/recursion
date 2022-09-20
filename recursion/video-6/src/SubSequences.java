import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.IntBinaryOperator;

public class SubSequences {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        printingSubSequences(List.of(1, 2, 3), 0, list);
    }

    public static void printingSubSequences(List<Integer> list, int counter, List<Integer> newList) {
        if (counter >= list.size()) {
            System.out.println(newList);
            return;
        }
        newList.remove(list.get(counter));
        printingSubSequences(list, counter + 1, newList);
        newList.add(list.get(counter));
        printingSubSequences(list, counter + 1, newList);

    }
}