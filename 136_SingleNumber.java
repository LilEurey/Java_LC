package Leetcode;

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0 ;i<nums.length;i++){
            int ch = 0;
            for(int j = 0 ;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    ch++;
                }
            }
            if(ch<=1){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}