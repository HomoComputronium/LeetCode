package com.homo.computronium.leetcode.easy.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/
// 13. Roman to Integer
public class Solution0013 {

    private final Map<String, Integer> int2string = new HashMap<>();

    public Solution0013() {
        populateMap();
    }

    public int romanToInt(String roman) {
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            String currentRoman = Character.toString(roman.charAt(i));
            Integer currentArabic = int2string.get(currentRoman);
            result += currentArabic;

            if (i != 0) {
                String prevRoman = Character.toString(roman.charAt(i - 1));
                Integer prevArabic = int2string.get(prevRoman);
                if (prevArabic < currentArabic) {
                    result -= prevArabic; // nullifying the previous addition
                    result -= prevArabic; // subtracting
                }
            }
        }
        return result;
    }

    private void populateMap() {
        int2string.put("I", 1);
        int2string.put("V", 5);
        int2string.put("X", 10);
        int2string.put("L", 50);
        int2string.put("C", 100);
        int2string.put("D", 500);
        int2string.put("M", 1000);
    }
}