package validPalindrome;

//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

public class Main {

    public static void main(String[] args) {
        run("Hello");
        run("Tahir");
        run("");
        run("ABBA");
    }

    private static void run(String s) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(s));
    }
}

class Solution {

    public boolean isPalindrome(String s) {
        boolean flag = true;
        int start = 0;
        int wordLength = s.length() - 1;
        s = s.toLowerCase();

        if (wordLength == -1) return true;
        else {
            while (wordLength > start)  {
                if (!Character.isLetterOrDigit(s.charAt(start))) start++;
                else if (!Character.isLetterOrDigit(s.charAt(wordLength))) wordLength--;
                else if (s.charAt(start) != s.charAt(wordLength)) {
                    flag = false;
                    break;
                }
                else {
                    start++;
                    wordLength--;
                }
            }

        }

        return flag;
    }

}
