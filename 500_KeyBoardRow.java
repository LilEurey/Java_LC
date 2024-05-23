package Leetcode;

import java.util.ArrayList;

class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        ArrayList<String> arr = new ArrayList<>();

        for (String word : words) {
            boolean check1 = true;
            boolean check2 = true;
            boolean check3 = true;
            String lowerCaseWord = word.toLowerCase();

            for (char c : lowerCaseWord.toCharArray()) {
                if (!firstRow.contains(Character.toString(c))) {
                    check1 = false;
                }
                if (!secondRow.contains(Character.toString(c))) {
                    check2 = false;
                }
                if (!thirdRow.contains(Character.toString(c))) {
                    check3 = false;
                }
            }

            if (check1 || check2 || check3) {
                arr.add(word);
            }
        }

        return arr.toArray(new String[0]);
    }
}
