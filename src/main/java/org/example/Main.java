package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 7};
        int target = 3;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("indexOf(3): " + BinarySearch.indexOf(arr, target));
        System.out.println("lowerBound(3): " + BinarySearch.lowerBound(arr, target));
        System.out.println("upperBound(3): " + BinarySearch.upperBound(arr, target));
    }
}
