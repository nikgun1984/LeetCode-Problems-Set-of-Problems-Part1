/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.interviewpreparation.Problems;

/**
 *
 * area = (right-left)*min(minHeight,maxHeight)
 * maxArea = max(area1,area2,area3...)
 * two pointers left and right
 */
public class ContainerWithMostWater {
    
    public int maxArea(int [] height){
        
        int max = 0;
        int leftPointer = 0;
        int rightPointer = height.length-1;
        
        //if(height == null) return max;
        
        while(leftPointer<rightPointer){
            int area = (rightPointer-leftPointer)*Math.min(height[leftPointer],height[rightPointer]);
            max = Math.max(area, max);
            
            if(height[leftPointer]<=height[rightPointer]){
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        
        return max;
    }
}
