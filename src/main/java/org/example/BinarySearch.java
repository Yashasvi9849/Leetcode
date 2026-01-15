package org.example;

import java.util.Objects;

public final class BinarySearch {

    private BinarySearch() {
    }

    // Classic binary search. Returns index if found, else -1.
    public static int indexOf(int[] arr, int target) {
        Objects.requireNonNull(arr, "arr must not be null");

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Lower bound. First index i such that arr[i] >= target. Returns arr.length if none.
    public static int lowerBound(int[] arr, int target) {
        Objects.requireNonNull(arr, "arr must not be null");

        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Upper bound. First index i such that arr[i] > target. Returns arr.length if none.
    public static int upperBound(int[] arr, int target) {
        Objects.requireNonNull(arr, "arr must not be null");

        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
