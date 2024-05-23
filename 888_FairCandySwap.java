package Leetcode;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int totala = 0 ;
        int totalb = 0 ;
        int all = 0;
        int arr [] = new int [2];
        for(int a : aliceSizes){
            totala+=a;
        }
        for(int b : bobSizes){
            totalb+=b;
        }
        all = totala+totalb;

        int eq = all/2;
        int a = eq-totala;
        for(int i = 0 ;i<aliceSizes.length;i++){
            for(int j = 0 ;j<bobSizes.length;j++){
                if(bobSizes[j]-aliceSizes[i] == a){
                    arr[0] = aliceSizes[i];
                    arr[1] = bobSizes[j];
                    break;
                }
            }
        }
        return arr;

    }
}