package Leetcode;

class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb1 = new StringBuilder(arr[i]);
            sb1.reverse();
            sb.append(sb1 + " ");
        }
        return sb.toString().trim();
    }
}