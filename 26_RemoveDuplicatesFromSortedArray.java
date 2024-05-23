package Leetcode;

// import java.util.ArrayList;

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0 ; 
        for(int i = 0 ; i<nums.length;i++){
            boolean ch = true;
            for(int j = 0 ; j<count ; j++){
                if(nums[i] == nums[j]){
                    ch = false; break;
                }
            }
            if(ch){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}