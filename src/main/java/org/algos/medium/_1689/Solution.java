package org.algos.medium._1689;

public class Solution {
    public static int minPartitions(String n) {
        final int len = n.length();
        char max = '0';

        for(int i = 0; i < len; i++){
            if(n.charAt(i) > max){
                max = n.charAt(i);
            }
        }
        return max - '0';
    }
}