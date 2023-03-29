package com.test.java8;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");

       // messages.forEach(word -> StringUtils.capitalize(word));
        messages.forEach(StringUtils::capitalize);

        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);

        numbers.stream()
                .sorted((a, b) -> a.compareTo(b));
        numbers.stream()
                .sorted(Integer::compareTo);


    }
}
