/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.codility.passing.cars;

/**
 *
 * @author kbos
 */
public class Solution {
    
    public int solution(int[] A) {
        int count0 = 0;
        int result = 0;
        for (int i : A) {
            if(i == 0) {
                count0++;
            } else {
                result += count0;
            }
        }
        
        if(result < 0 || result > 1000000000) {
            return -1;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        
    }
    
}
