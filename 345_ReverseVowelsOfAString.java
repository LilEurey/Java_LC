package Leetcode;

class Solution {
    public String reverseVowels(String s) {
        String a = s;
        char[] b = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u' || b[i] == 'A' || b[i] == 'E'
                    || b[i] == 'I' || b[i] == 'O' || b[i] == 'U') {
                sb.append(a.charAt(i));
            }
        }
        sb.reverse();
        int j = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u' || b[i] == 'A' || b[i] == 'E'
                    || b[i] == 'I' || b[i] == 'O' || b[i] == 'U') {
                b[i] = sb.charAt(j);
                j++;
            }
        }
        String c = "";
        for (int i = 0; i < a.length(); i++) {
            c += b[i];
        }
        return c;
    }
}