package com.homo.computronium.leetcode.easy.fizz_buzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0412Test {

    @Test
    public void testGetFizzBuzzValue() {
        Solution0412 solution = new Solution0412();

        assertEquals("Fizz", solution.getFizzBuzzValue(33));
        assertEquals("Buzz", solution.getFizzBuzzValue(55));
        assertEquals("FizzBuzz", solution.getFizzBuzzValue(15));
        assertEquals("7", solution.getFizzBuzzValue(7));
    }

    @Test
    public void testFizzBuzzLeetCodeCases() {
        Solution0412 solution = new Solution0412();

        List<String> expectedList1 = List.of("1", "2", "Fizz");
        assertEquals(expectedList1, solution.fizzBuzz(3));

        List<String> expectedList2 = List.of("1","2","Fizz","4","Buzz");
        assertEquals(expectedList2, solution.fizzBuzz(5));

        List<String> expectedList3 = List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
        assertEquals(expectedList3, solution.fizzBuzz(15));
    }

}