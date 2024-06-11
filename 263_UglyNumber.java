package Leetcode;

import java.util.ArrayList;

class Solution {
    public boolean isUgly(int n) {
        boolean ch = true;
        ArrayList <Integer> arr = new ArrayList<>();
        while(n>1){
            for(int i = 2 ;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    arr.add(i);
                    n/=i;
                    break;
                }
            }
        }
        for(int i = 0 ; i<arr.size();i++){
            if(checkPrime(arr.get(i)) && arr.get(i)>5){
                ch = false;
                break;
            }
        }
        return ch;
    }

    public boolean checkPrime(int a) {
        boolean prime = true; // We give a boolean True for prime number
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {// If a(input number) can be divided by any number before them ,it is not Prime.
                prime = false;// Therefore, we give this situation be False.
                break;
            }
        }
        return prime;
    }
} //Not finish
