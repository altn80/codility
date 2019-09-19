/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.codility.cycling.rotation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 *
 * @author kbos
 */
public class Solution {

    public int[] solution(int[] A, int K) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.stream(A).boxed().collect(Collectors.toList()));
        for (int i = 0; i < K; i++) {
            list.add(0, list.pollLast());
        }
        return list.stream().mapToInt(tif -> tif).toArray();
    }

    class Num {

        int num;

        public Num(int num) {
            this.num = num;
        }

        public Integer getNum() {
            return num;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 89 * hash + this.num;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Num other = (Num) obj;
            return this.num == other.num;
        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 8, 9, 7, 6}, 3));
    }

}
