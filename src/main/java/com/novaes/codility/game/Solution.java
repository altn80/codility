/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.codility.game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author andre
 */
public class Solution {

    public int solution(int[] A) {
        List<Integer> values = new ArrayList<>();
        dfs(A[0], 0, A, values);
        return values.stream().max(Comparator.naturalOrder()).orElse(0);

    }

    public void dfs(int currentValue, int currentIndex, int[] A, List<Integer> values) {
        int[] possibilities = new int[]{1, 2, 3, 4, 5, 6};
        for (int possibility : possibilities) {
            if (currentIndex + possibility < A.length) {
                currentValue = currentValue + A[currentIndex + possibility];
                dfs(currentValue, currentIndex + possibility, A, values);
            } else {
                values.add(currentValue);
                currentValue = A[0];
                currentIndex = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1,-2,0,9,-1,-2}));
    }

}
