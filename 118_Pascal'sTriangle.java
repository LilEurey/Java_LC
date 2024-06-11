package Leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>(numRows);

        for (int i = 1; i <= numRows; i++) {
            List<Integer> arr1 = new ArrayList<>();
            if (i == 1) {
                arr1.add(1);
            } else if (i == 2) {
                arr1.add(1);
                arr1.add(1);
            } else {
                arr1.add(1);
                for (int j = 0; j < arr.get(i - 2).size() - 1; j++) {
                    int sum = arr.get(i - 2).get(j) + arr.get(i - 2).get(j + 1);
                    arr1.add(sum);
                }
                arr1.add(1);
            }
            arr.add(arr1);
        }
        return arr;
    }
}