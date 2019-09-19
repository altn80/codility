/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.codility.minimum.number;

/**
 *
 * @author kbos
 */
public class Solution {

    public int solution(int[] A) {
        boolean[] visited = new boolean[1000001];
        for (int i : A) {
            if(i > 0) {
                visited[i] = true;
            }
        }
        for (int i = 1; i < visited.length; i++) {
            if(!visited[i]) {
                return i;
            }
        }
        return 1;
    }

}
