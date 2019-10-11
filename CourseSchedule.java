/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.interviewpreparation.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author nickgun1984
 */
public class CourseSchedule {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int count = 0;
        Map<Integer,List<Integer>> map = new HashMap<>();
        int [] indegree  = new int[numCourses];
        
        for(int[]pre:prerequisites){
            List<Integer> l = map.getOrDefault(pre[1], new ArrayList<>());
            l.add(pre[0]);
            indegree[pre[0]]++;
            map.put(pre[1], l);
        }
        
        //BFS
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            if(indegree[cur]==0)count++;
            if(!map.containsKey(cur))continue;
            
            for(int neig:map.get(cur)){
                indegree[neig]--;
                if(indegree[neig]==0) q.offer(neig);
            }
        }
        
        return count == numCourses;
    }
}
