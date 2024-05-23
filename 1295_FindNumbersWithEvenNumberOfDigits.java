package Leetcode;

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int countdigit = 0;
            int a = nums[i];
            while (a != 0) {
                a /= 10;
                countdigit++;
            }
            if (countdigit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}