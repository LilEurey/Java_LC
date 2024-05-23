package Leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int use = i;
            boolean selfDividing = true;
            while (use != 0) {
                int digit = use % 10;
                if (digit == 0 || i % digit != 0) {
                    selfDividing = false;
                    break;
                }
                use /= 10;
            }
            if (selfDividing) {
                li.add(i);
            }
        }
        return li;
    }
}
