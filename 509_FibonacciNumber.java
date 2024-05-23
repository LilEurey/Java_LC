package Leetcode;

class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;
            if (n > 2) {

                for (int i = 2; i < arr.length; i++) {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
                return arr[n - 1] + arr[n - 2];
            } else {
                return arr[n - 1] + arr[n - 2];

            }
        }
    }
}