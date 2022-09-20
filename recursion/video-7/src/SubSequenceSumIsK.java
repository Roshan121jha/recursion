
import java.util.ArrayList;
import java.util.List;

public class SubSequenceSumIsK {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //printingSubSequences(List.of(1, 2, 1), 0, list, 0);
        System.out.println(printingSubSequencesCount(List.of(1, 2, 1), 0, list, 0));
    }

    public static boolean printingSubSequences(List<Integer> list, int counter, List<Integer> newList, int sum) {
        if (counter >= list.size()) {
            if (sum == 2) {
                System.out.println(newList);
                return true;
            }
            else {
                return false;
            }
        }
        sum += list.get(counter);
        newList.add(list.get(counter));
        if(printingSubSequences(list, counter + 1, newList, sum)){
            return true;
        }
        sum -= list.get(counter);
        newList.remove(list.get(counter));
        return printingSubSequences(list, counter + 1, newList, sum);
    }

    public static int printingSubSequencesCount(List<Integer> list, int counter, List<Integer> newList, int sum) {
        if (counter >= list.size()) {
            if (sum == 2) {
                return 1;
            }
            else {
                return 0;
            }
        }
        sum += list.get(counter);
        newList.add(list.get(counter));
        final int add = printingSubSequencesCount(list, counter + 1, newList, sum);
        sum -= list.get(counter);
        newList.remove(list.get(counter));
        final int remove = printingSubSequencesCount(list, counter + 1, newList, sum);
        return add + remove;
    }
}