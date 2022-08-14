package com.homo.computronium.leetcode.easy.e0997;

import java.util.HashMap;
import java.util.HashSet;
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

        Set<Integer> trustingPeople = new HashSet<>();
        Set<Integer> trustedPeople = new HashSet<>();

        for (int[] trustPair : trust) {
            trustingPeople.add(trustPair[0]);
            trustedPeople.add(trustPair[1]);
        }

        List<Integer> possibleJudgesList = trustedPeople.stream()
                .filter(possibleJudge -> !trustingPeople.contains(possibleJudge))
                .toList();

        Map<Integer, Set<Integer>> person2trusters = buildPerson2Trusters(trust, possibleJudgesList);

        for (Integer candidate : possibleJudgesList) {
            if (doesEverybodyTrustCandidate(n, candidate, person2trusters)) {
                return candidate;
            }
        }
        return -1;
    }

    private boolean doesEverybodyTrustCandidate(
            int population,
            int candidate,
            Map<Integer, Set<Integer>> person2trusters
    ) {
        Set<Integer> townExceptJudgeList = IntStream.rangeClosed(1, population)
                .boxed()
                .filter(integer -> integer != candidate)
                .collect(Collectors.toSet());

        Set<Integer> trusterSet = person2trusters.get(candidate);
        if (Objects.isNull(trusterSet)) {
            return false;
        }
        return trusterSet.equals(townExceptJudgeList);
    }

    private Map<Integer, Set<Integer>> buildPerson2Trusters(
            int[][] trust, List<Integer> possibleJudgesList
    ) {
        Map<Integer, Set<Integer>> person2trusters = new HashMap<>();

        for (Integer possibleJudge : possibleJudgesList) {
            for (int[] trustPair : trust) {
                if (trustPair[1] == possibleJudge) {
                    person2trusters.computeIfAbsent(trustPair[1], set -> new HashSet<>())
                            .add(trustPair[0]);
                }
            }
        }
        return person2trusters;
    }
}
