package com.homo.computronium.leetcode.easy.roman_to_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0013Test {

    @Test
    public void simpleCases() {
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

        Solution0013 solution = new Solution0013();

        assertEquals(1, solution.romanToInt("I"));
        assertEquals(5, solution.romanToInt("V"));
        assertEquals(10, solution.romanToInt("X"));
        assertEquals(50, solution.romanToInt("L"));
        assertEquals(100, solution.romanToInt("C"));
        assertEquals(500, solution.romanToInt("D"));
        assertEquals(1000, solution.romanToInt("M"));
    }

    @Test
    public void casesWithAddingRomans() {
        Solution0013 solution = new Solution0013();

        assertEquals(1, solution.romanToInt("I"));
        assertEquals(2, solution.romanToInt("II"));
        assertEquals(3, solution.romanToInt("III"));

        assertEquals(6, solution.romanToInt("VI"));
        assertEquals(7, solution.romanToInt("VII"));
        assertEquals(8, solution.romanToInt("VIII"));

        assertEquals(26, solution.romanToInt("XXVI"));
        assertEquals(27, solution.romanToInt("XXVII"));
        assertEquals(28, solution.romanToInt("XXVIII"));
    }

    @Test
    public void casesWithSubtractingRomans() {
        Solution0013 solution = new Solution0013();

        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(14, solution.romanToInt("XIV"));

        assertEquals(19, solution.romanToInt("XIX"));
        assertEquals(34, solution.romanToInt("XXXIV"));
    }

    @Test
    public void nativeLeetCodeTestCases() {
        Solution0013 solution = new Solution0013();

        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

}