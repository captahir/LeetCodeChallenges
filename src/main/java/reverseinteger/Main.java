package reverseinteger;
/*
Given a 32-bit signed integer, reverse digits of an integer.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
[−231,  231 − 1]. For the purpose of this problem,
 assume that your function returns 0 when the reversed integer overflows.
 */


public class Main {


    public static void main(String[] args) {
        run(-14);
        run(1204615348);
        run(9);
        run(-320);
    }

    private static void run (int input) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(input));

    }
}

class Solution {

    public int reverse(int x) {
        int a = 0;

        while (x !=0) {
            int remainder = x%10;
            x/=10;
            if (a > Integer.MAX_VALUE/10 || (a == Integer.MAX_VALUE && remainder > 7)) return 0;
            if (a < Integer.MIN_VALUE/10 || (a == Integer.MIN_VALUE && remainder < -8)) return 0;
            a = a*10 + remainder;
        }
        return a;
    }

}
