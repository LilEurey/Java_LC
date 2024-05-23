package Leetcode;

class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                arr[i] = 1;
            }
            if (s.charAt(i) == 'V') {
                arr[i] = 5;
            }
            if (s.charAt(i) == 'X') {
                arr[i] = 10;
            }
            if (s.charAt(i) == 'L') {
                arr[i] = 50;
            }
            if (s.charAt(i) == 'C') {
                arr[i] = 100;
            }
            if (s.charAt(i) == 'D') {
                arr[i] = 500;
            }
            if (s.charAt(i) == 'M') {
                arr[i] = 1000;
            }
        }
        int j = 0;
        while (j < arr.length - 1) {
            if (arr[j + 1] > arr[j]) {
                ans += arr[j + 1] - arr[j];
                j += 2;
            } else {
                ans += arr[j];
                j++;
            }
        }
        if (j == arr.length - 1) {
            ans += arr[j];
        }
        return ans;

    }
}