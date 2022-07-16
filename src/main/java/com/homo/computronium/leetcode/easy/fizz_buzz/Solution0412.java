package com.homo.computronium.leetcode.easy.fizz_buzz;

import java.util.Arrays;
import java.util.List;

// 412. Fizz Buzz
// https://leetcode.com/problems/fizz-buzz/
public class Solution0412 {
    public List<String> fizzBuzz(int n) {
        String[] fizzBuzzArray = new String[n];

        for (int i = 0; i < n; i++) {
            fizzBuzzArray[i] = getFizzBuzzValue(i + 1);
        }

        return Arrays.asList(fizzBuzzArray);
    }

    public String getFizzBuzzValue(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }
}
