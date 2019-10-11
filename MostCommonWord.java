/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.interviewpreparation.Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 1. Convert string into strings lowercase and no spaces
 * 2. Use set for banned words
 * 3. Filter our words excluding banned words
 * 4. Using values of our keys find the most common word
 */
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        String [] words = paragraph.toLowerCase().split("\\W+");
        Set<String> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        
        for(String bannedWord:banned){
            set.add(bannedWord);
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String word:words){
            if(!set.contains(word)){
                map.put(word,map.getOrDefault(word, 0)+1);
            }
        }
        
        String result = "";
        for(String word:map.keySet()){
            if(map.get(word)>max){
                max = map.get(word);
                result = word;
            }
        }
        
        return result;
    }
}
