package Leetcode;

class Solution {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        if (haystack.length() >= needle.length()) {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0) && haystack.length() - i >= needle.length()) {
                    boolean ch = true;
                    for (int j = 0; j < needle.length(); j++) {
                        if (haystack.charAt(i + j) != needle.charAt(j)) {
                            ch = false;
                            break;
                        }
                    }
                    if (ch) {
                        ans = i;
                        break;
                    }
                }
            }
            return ans;
        } else {
            return ans;
        }
    }
}