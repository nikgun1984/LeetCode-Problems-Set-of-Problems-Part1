/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.interviewpreparation.Problems;

import java.util.HashMap;

/**
 *
 * 1. Convert string to characters
 * 2. Create Dictionary to keep track of characters
 * 3. Compare letters of a string with HashMap if the most first 1 == less chars return it
 */
public class FirstUniqueCharacter {
    
    public int firstUniqChar(String s) {
        
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(Character ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        for(int i=0;i<s.length();i++){
           if(map.get(s.charAt(i))==1){
               return i;
           }
                

        }
        
        return -1;
    }
    
}
