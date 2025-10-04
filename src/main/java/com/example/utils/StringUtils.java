package com.example.utils;

/**
 * Utility class for common string operations.
 * Built using Test-Driven Development principles.
 */
public class StringUtils {

    /**
     * Private constructor to prevent instantiation of utility class
     */
    private StringUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Checks if a string is null or empty.
     *
     * @param str the string to check
     * @return true if string is null or empty, false otherwise
     */
    public static boolean isEmpty(String str) {
        // Minimal implementation to make tests pass
        return str == null || str.isEmpty();
    }
}
