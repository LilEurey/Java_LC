package Leetcode;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        } else if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            boolean ch = true;
            while (n > 1) {
                if (n % 2 != 0) {
                    ch = false;
                    break;
                }
                n /= 2;
            }
            return ch;
        }
    }
}