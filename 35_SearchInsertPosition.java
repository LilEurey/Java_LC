package Leetcode;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.length+1; i++) {
            ans = i;
            if (nums[i] >= target) {
                break;
            }
            if(i==nums.length-1){
                if(nums[nums.length-1]<target){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}