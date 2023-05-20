package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.length() == 0) {
            return new HashMap<>();
        }
        String[] res = sentence.trim().toLowerCase().replaceAll("\\p{IsPunctuation}", "").split(" ");
        return Arrays.stream(res)
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
    }
}
