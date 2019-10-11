/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.interviewpreparation.Problems;

/**
 *
 * @author nickgun1984
 */
public class LongestPalindrome {
     public int longestPalindrome(String s) {
        
        int result = 0;
        
        int [] charCount = new int [128];
        
        for(char c: s.toCharArray()){
            charCount[c]++;
        }
        
        for(Integer i: charCount){
            result+=i/2 *2;
            if(result%2==0 && i%2==1) result+=1;
        }
        return result;
    }
}
