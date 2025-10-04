package com.example.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for StringUtils following TDD principles.
 * Each test method follows the pattern: Given-When-Then
 */
class StringUtilsTest {

    /**
     * Test: isEmpty() should return true for null string
     * This is our first RED test - it will fail because StringUtils doesn't exist yet
     */
    @Test
    void isEmpty_ShouldReturnTrue_WhenStringIsNull() {
        // Given: a null string
        String input = null;

        // When: checking if string is empty
        boolean result = StringUtils.isEmpty(input);

        // Then: result should be true
        assertTrue(result, "isEmpty() should return true for null string");
    }

    /**
     * Test: isEmpty() should return true for empty string
     */
    @Test
    void isEmpty_ShouldReturnTrue_WhenStringIsEmpty() {
        // Given: an empty string
        String input = "";

        // When: checking if string is empty
        boolean result = StringUtils.isEmpty(input);

        // Then: result should be true
        assertTrue(result, "isEmpty() should return true for empty string");
    }

    /**
     * Test: isEmpty() should return false for non-empty string
     */
    @Test
    void isEmpty_ShouldReturnFalse_WhenStringHasContent() {
        // Given: a string with content
        String input = "Hello";

        // When: checking if string is empty
        boolean result = StringUtils.isEmpty(input);

        // Then: result should be false
        assertFalse(result, "isEmpty() should return false for non-empty string");
    }
}
