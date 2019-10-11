/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.interviewpreparation.Problems;

/**
 *
 * Recursion/Deep First Search
 */
public class WordSearch {
    
    public boolean exist(char[][] board, String word) {
        
        if(board == null || board.length == 0 || board[0].length == 0){
            return false;
        }
        
        int row = board.length; int column = board[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(helper(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean helper(char[][] board, String word, int index, int i, int j){
        
        if(index == word.length()) return true;
       
        
        if(i<0 || i>=board.length ||j<0||j>=board[0].length||word.charAt(index)!=board[i][j]){
            return false;
        }
        
        char c = board[i][j];
        board[i][j] = '#';
        
        boolean result = helper(board,word,index+1,i-1,j)||
                         helper(board,word,index+1,i+1,j)||
                         helper(board,word,index+1,i,j-1)||
                         helper(board,word,index+1,i,j+1);
        
        board[i][j] = c;
        
        return result;
    }
}
