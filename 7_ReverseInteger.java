package Leetcode;

class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x != 0){
            int r = x%10;
            x /= 10;
              if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0; // Overflow case
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && r < -8)) {
                return 0; // Underflow case
            }
            ans = (ans*10)+r;
        }
        return ans;
    }
}