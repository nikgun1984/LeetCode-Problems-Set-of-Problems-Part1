/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.interviewpreparation.Problems;

import java.util.Stack;

/**
 *
 * @author nickgun1984
 */
public class ValidParanthesis {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) return false;
                
                if(s.charAt(i)==']' && stack.peek()!='['
                  && s.charAt(i)==')' && stack.peek()!='('
                  && s.charAt(i)=='}' && stack.peek()!='{'){
                    return false;
                }
                
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}
