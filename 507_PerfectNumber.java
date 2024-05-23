package Leetcode;

class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int r, sum = 0;
        while (num > 0) {
            r = num % 10;
            sum = r + (sum * 10);
            num /= 10;
        }
        if (sum == x) {
            return true;
        } else {
            return false;
        }
    }
}