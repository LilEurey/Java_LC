package Leetcode;

class Solution {
    public void nextPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + i < nums.length) {
                int a = nums[i];
                nums[i] = nums[i + i];
                nums[i + i] = a;
            } else {
                int a = i + i - nums.length - 1;
                int temp = nums[a];
                nums[a] = nums[i];
                nums[i] = temp;

            }

        }
    }
}