/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.codility.distincts;

import java.util.Arrays;

/**
 *
 * @author andre
 */
public class Solution {

    public int solution(int[] A) {
        boolean[] visitedPos = new boolean[1000001];
        boolean[] visitedNeg = new boolean[1000000];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] < 0) {
                int index = A[i]*(-1);
                if(!visitedNeg[index]) {
                    visitedNeg[index] = true;
                    count++;
                }
            } else {
                if(!visitedPos[A[i]]) {
                    visitedPos[A[i]] = true;
                    count++;
                }
            }
        }
        return count;
    }

}
