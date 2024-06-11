package Leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>(rowIndex);

        for (int i = 1; i <= rowIndex + 1; i++) {
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
        return arr.get(rowIndex);
    }
}