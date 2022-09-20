import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{2, 3, 6, 7};
        List<Integer> list = new ArrayList<>();
        findCombinations(0, 7, list, sourceArray);
    }

    private static int findCombinations(int index, int target, List<Integer> list, int[] sourceArray) {
        if (index >= sourceArray.length) {
            if (target == 0) {
                System.out.println(list);
                return  1;
            }
            return 0;
        }
        if (sourceArray[index] <= target) {
            list.add(sourceArray[index]);
            findCombinations(index, target-sourceArray[index], list, sourceArray);
            list.remove(list.size()-1);
        }
        return findCombinations(index+1, target, list, sourceArray);
    }
}