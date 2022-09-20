import java.util.Objects;

public class FunctionalPalindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome(new String[]{"M", "D", "D", "A", "M"}, 0, 4));
    }

    private static boolean checkPalindrome(String[] palindromeString, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return true;
        }
        if (!Objects.equals(palindromeString[startIndex], palindromeString[endIndex])) {
            return false;
        }
        return checkPalindrome(palindromeString, startIndex + 1, endIndex - 1);
    }
}
