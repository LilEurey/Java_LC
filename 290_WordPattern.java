package Leetcode;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] arr = pattern.toCharArray();
        String[] arr1 = s.split(" ");
        String[] ch = new String[arr1.length];
        boolean ans = true;
        if (arr1.length == arr.length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (arr[i] == arr[j] && !arr1[i].equals(arr1[j])) {
                        ans = false;
                        break;
                    } else if (arr[i] != arr[j] && arr1[i].equals(arr1[j])) {
                        ans = false;
                        break;
                    }
                }
            }

        } else {
            ans = false;
        }
        return ans;

    }
}