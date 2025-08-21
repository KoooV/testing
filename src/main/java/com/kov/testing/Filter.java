package com.kov.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public List<Integer> evenFilter(List<Integer> numbers){
        if(numbers == null || numbers.isEmpty()){
            return Collections.emptyList();
        }
        numbers = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return numbers;
    }
}
