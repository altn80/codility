/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.codility.passing.cars;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author kbos
 */
public class SolutionTest {
    
    
    @Test
    public void test1() {
        Assert.assertEquals(5, new Solution().solution(new int[]{0,1,0,1,1}));
    }
    
    @Test
    public void test2() {
        Assert.assertEquals(4, new Solution().solution(new int[]{1,0,0,1,1}));
    }
    
    @Test
    public void test3() {
        Assert.assertEquals(1, new Solution().solution(new int[]{0,1}));
    }
    
    @Test
    public void test4() {
        Assert.assertEquals(2, new Solution().solution(new int[]{0,1,1}));
    }
    
    @Test
    public void test5() {
        Assert.assertEquals(9, new Solution().solution(new int[]{0,0,1,1,1,0,1}));
    }
    
    
    
    
}
