package com.homo.computronium.leetcode.easy.ransom_note;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution0383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Long> magazineLetterCountMap = magazine.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Map<Character, Long> ransomNoteLetterCountMap = ransomNote.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Set<Character> ransomNoteCharacters = ransomNoteLetterCountMap.keySet();
        for (Character character : ransomNoteCharacters) {
            Long ransomNoteLetterCount = ransomNoteLetterCountMap.get(character);
            Long magazineLetterCount = magazineLetterCountMap.get(character);

            if (magazineLetterCount == null || magazineLetterCount < ransomNoteLetterCount) {
                return false;
            }
        }
        return true;
    }
}
