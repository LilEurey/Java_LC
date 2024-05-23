package Leetcode;

class Solution {
    public int subtractProductAndSum(int n) {
        int a = n;
        int b = 1; // result for *
        int d = 0;
        while (a > 0) {
            int c = a % 10;
            b *= c;
            d += c;
            a /= 10;
        }
        return b - d;

    }
}