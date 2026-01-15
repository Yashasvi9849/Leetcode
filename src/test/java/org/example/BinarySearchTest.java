package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void indexOf_findsExistingElement() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(3, BinarySearch.indexOf(arr, 8));
    }

    @Test
    void indexOf_returnsMinusOneWhenNotFound() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(-1, BinarySearch.indexOf(arr, 7));
    }

    @Test
    void lowerBound_worksWithDuplicates() {
        int[] arr = {1, 3, 3, 5, 7};
        assertEquals(1, BinarySearch.lowerBound(arr, 3));
        assertEquals(3, BinarySearch.lowerBound(arr, 4));
        assertEquals(0, BinarySearch.lowerBound(arr, 0));
        assertEquals(5, BinarySearch.lowerBound(arr, 10));
    }

    @Test
    void upperBound_worksWithDuplicates() {
        int[] arr = {1, 3, 3, 5, 7};
        assertEquals(3, BinarySearch.upperBound(arr, 3));
        assertEquals(4, BinarySearch.upperBound(arr, 5));
        assertEquals(0, BinarySearch.upperBound(arr, 0));
        assertEquals(5, BinarySearch.upperBound(arr, 10));
    }

    @Test
    void nullArray_throws() {
        assertThrows(NullPointerException.class, () -> BinarySearch.indexOf(null, 3));
    }
}
