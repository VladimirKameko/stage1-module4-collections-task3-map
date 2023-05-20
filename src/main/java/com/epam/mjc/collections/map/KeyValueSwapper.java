package com.epam.mjc.collections.map;

import java.util.*;
import java.util.stream.Collectors;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        return new HashMap<>(sourceMap)
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (a, b) -> a));
    }
}
