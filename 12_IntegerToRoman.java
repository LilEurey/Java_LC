package Leetcode;

class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        if (num >= 1000) {
            int time = num / 1000;
            num %= 1000;
            for (int i = 0; i < time; i++) {
                sb.append("M");
            }
        }
        if (num >= 100) {
            int time = num / 100;
            if (time < 4) {
                for (int i = 0; i < time; i++) {
                    sb.append("C");
                }
            } else if (time == 4) {
                sb.append("CD");
            } else if (time == 5) {
                sb.append("D");
            } else if (time > 5 && time < 9) {
                sb.append("D");
                for (int i = 0; i < time - 5; i++) {
                    sb.append("C");
                }
            } else if (time == 9) {
                sb.append("CM");
            }
            num %= 100;
        }
        if (num >= 10) {
            int time = num / 10;
            if (time < 4) {
                for (int i = 0; i < time; i++) {
                    sb.append("X");
                }
            } else if (time == 4) {
                sb.append("XL");
            } else if (time == 5) {
                sb.append("L");
            } else if (time > 5 && time < 9) {
                sb.append("L");
                for (int i = 0; i < time - 5; i++) {
                    sb.append("X");
                }
            } else if (time == 9) {
                sb.append("XC");
            }
            num %= 10;
        }
        if (num < 10) {
            int time = num;
            if (time < 4) {
                for (int i = 0; i < time; i++) {
                    sb.append("I");
                }
            } else if (time == 4) {
                sb.append("IV");
            } else if (time == 5) {
                sb.append("V");
            } else if (time > 5 && time < 9) {
                sb.append("V");
                for (int i = 0; i < time - 5; i++) {
                    sb.append("I");
                }
            } else if (time == 9) {
                sb.append("IX");
            }
            num %= 10;
        }
        return sb.toString();
    }
}
