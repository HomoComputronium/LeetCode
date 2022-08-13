package com.homo.computronium.leetcode.easy.e0997;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://leetcode.com/problems/find-the-town-judge/
// 997. Find the Town Judge
public class Solution0997 {

    public int findJudge(int n, int[][] trust) {
        if (n == 1) {
            return 1;
        }
        if (trust.length == 0) {
            return -1;
        }

        Set<Integer> trustingPeople = Arrays.stream(trust)
                .map(trustPair -> trustPair[0])
                .collect(Collectors.toSet());

        Set<Integer> trustedPeople = Arrays.stream(trust)
                .map(trustPair -> trustPair[1])
                .collect(Collectors.toSet());

        List<Integer> possibleJudgesList = trustedPeople.stream()
                .filter(possibleJudge -> !trustingPeople.contains(possibleJudge))
                .toList();

        Map<Integer, List<Integer>> person2trusters = buildPerson2Trusters(trust);

        for (Integer candidate : possibleJudgesList) {
            if (doesEverybodyTrustCandidate(n, candidate, person2trusters)) {
                return candidate;
            }
        }

        return -1;
    }

    private boolean doesEverybodyTrustCandidate(int population, int candidate, Map<Integer, List<Integer>> person2trusters) {


        List<Integer> townExceptJudgeList = IntStream.rangeClosed(1, population)
                .mapToObj(integer -> integer)
                .filter(integer -> integer != candidate).toList();

        List<Integer> trusterList = person2trusters.get(candidate);
        if (Objects.isNull(trusterList)) {
            return false;
        }
        return trusterList.containsAll(townExceptJudgeList);
    }

    private Map<Integer, List<Integer>> buildPerson2Trusters(int[][] trust) {
        Map<Integer, List<Integer>> person2trusters = new HashMap<>();

        for (int[] trustPair : trust) {
            person2trusters.computeIfAbsent(trustPair[1], list -> new ArrayList<>())
                    .add(trustPair[0]);
        }
        return person2trusters;
    }
}
