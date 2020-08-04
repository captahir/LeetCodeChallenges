package casecontrol;

public class Main {
    public static void main(String[] args) {
    run("Yes");
    run("yes");
    run("YES");
    run("yEs");
    }

    private static void run(String word) {
        Solution solution = new Solution();
        System.out.println(solution.detectCapitalUse(word));
    }
}

class Solution {

    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        boolean first = isUppercase(chars);
        boolean second = isLowercase(chars);
        boolean third = isSentenceCase(chars);

        return first || second || third;
    }

    private boolean isSentenceCase(char[] word) {
       int length = word.length;

       if (length == 1) return true;

       else if (length == 2 && Character.isLowerCase(word[0])
                            && Character.isUpperCase(word[1])) return false;

       else if (length > 2 && anyOtherUpperCase(word)) return false;

       else return true;
    }

    private boolean isLowercase(char[] word) {
        boolean flag = true;
        for (char c: word) {
            if (!Character.isLowerCase(c)) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    private boolean isUppercase(char[] word) {
        boolean flag = true;
        for (char c: word) {
            if (!Character.isUpperCase(c)) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    private boolean anyOtherUpperCase(char[] word) {
        boolean flag = false;

        for (int i = 1; i < word.length; i++) {
            if (Character.isUpperCase(word[i])) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
