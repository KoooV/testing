package com.kov.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTest {
    private Filter filter;

    @BeforeEach
    void setUp(){
        filter = new Filter();
    }

    @Test
    @DisplayName("filter mixed nums")
    void testEvenFilter(){
        assertEquals(Arrays.asList(2,4), filter.evenFilter(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    @DisplayName("filter odd nums")
    void testOddFilter(){
        assertEquals(Collections.emptyList(), filter.evenFilter(Arrays.asList(1, 3, 5)));
    }

    @Test
    @DisplayName("filter null input")
    void testNullFilter(){
        assertEquals(Collections.emptyList(), filter.evenFilter(null));
    }

    @Test
    @DisplayName("filter empty input")
    void testEmptyFilter(){
        List<Integer> numbers = new ArrayList<>();
        assertEquals(Collections.emptyList(), filter.evenFilter(numbers));
    }
}
