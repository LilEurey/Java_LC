package Leetcode;

class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        for(int i  = 0 ; i<s.length;i++){
            sb.append(s[i]);
        }
        sb.reverse();
        String a = sb.toString();
        for(int i  = 0 ; i<s.length;i++){
            s[i] = a.charAt(i);
        }
    }
}