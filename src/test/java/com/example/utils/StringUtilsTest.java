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

    /**
     * Test: reverse() should return null for null input
     */
    @Test
    void reverse_ShouldReturnNull_WhenInputIsNull() {
        // Given: a null string
        String input = null;

        // When: reversing the string
        String result = StringUtils.reverse(input);

        // Then: result should be null
        assertNull(result, "reverse() should return null for null input");
    }

    /**
     * Test: reverse() should return empty string for empty input
     */
    @Test
    void reverse_ShouldReturnEmpty_WhenInputIsEmpty() {
        // Given: an empty string
        String input = "";

        // When: reversing the string
        String result = StringUtils.reverse(input);

        // Then: result should be empty
        assertEquals("", result, "reverse() should return empty string for empty input");
    }

    /**
     * Test: reverse() should reverse normal string
     */
    @Test
    void reverse_ShouldReverseString_WhenInputIsValid() {
        // Given: a normal string
        String input = "hello";

        // When: reversing the string
        String result = StringUtils.reverse(input);

        // Then: result should be reversed
        assertEquals("olleh", result, "reverse() should return reversed string");
    }

    /**
     * Test: isPalindrome() should return false for null input
     * Design decision: null is not a palindrome
     */
    @Test
    void isPalindrome_ShouldReturnFalse_WhenInputIsNull() {
        assertFalse(StringUtils.isPalindrome(null),
                "isPalindrome() should return false for null input");
    }

    /**
     * Test: isPalindrome() should return true for empty string
     */
    @Test
    void isPalindrome_ShouldReturnTrue_WhenInputIsEmpty() {
        assertTrue(StringUtils.isPalindrome(""),
                "isPalindrome() should return true for empty string");
    }

    /**
     * Test: isPalindrome() should return true for single character
     */
    @Test
    void isPalindrome_ShouldReturnTrue_WhenInputIsSingleCharacter() {
        assertTrue(StringUtils.isPalindrome("a"),
                "isPalindrome() should return true for single character");
    }

    /**
     * Test: isPalindrome() should return true for valid palindrome
     */
    @Test
    void isPalindrome_ShouldReturnTrue_WhenInputIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("racecar"),
                "isPalindrome() should return true for 'racecar'");
        assertTrue(StringUtils.isPalindrome("madam"),
                "isPalindrome() should return true for 'madam'");
    }

    /**
     * Test: isPalindrome() should return false for non-palindrome
     */
    @Test
    void isPalindrome_ShouldReturnFalse_WhenInputIsNotPalindrome() {
        assertFalse(StringUtils.isPalindrome("hello"),
                "isPalindrome() should return false for 'hello'");
        assertFalse(StringUtils.isPalindrome("world"),
                "isPalindrome() should return false for 'world'");
    }

    /**
     * Test: isPalindrome() should be case-insensitive
     */
    @Test
    void isPalindrome_ShouldBeCaseInsensitive() {
        assertTrue(StringUtils.isPalindrome("RaceCar"),
                "isPalindrome() should be case-insensitive");
        assertTrue(StringUtils.isPalindrome("MadAm"),
                "isPalindrome() should be case-insensitive");
    }
}
