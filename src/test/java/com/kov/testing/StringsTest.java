package com.kov.testing;

import com.kov.testing.testingClases.Strings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsTest {
    private Strings strings;

    @BeforeEach
    void setUp(){
        strings = new Strings();
    }

    @Test
    @DisplayName("First if conditions, null")
    void testReverseNull(){
        assertEquals("", strings.reverse(null), "Correct is '' ");
    }

    @Test
    @DisplayName("Second if conditions, '' ")
    void testReverseEmptyString(){
        assertEquals("", strings.reverse("") , "Correct is '' ");

    }

    @Test
    @DisplayName("Reverse normal strings")
    void testReverseNormalString(){
        assertEquals("cba", strings.reverse("abc"), "Correct is cba ");
    }

}
