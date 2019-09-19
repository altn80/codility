/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.codility.perm.check;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kbos
 */
public class Solution {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if(set.contains(A[i])) {
                return 0;
            }
            set.add(A[i]);
            if(A[i] > max) {
                max = A[i];
            }
        }
        return set.size() == max ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{4, 1, 3, 2}));
    }

}
