/*
 * Problem Statement:
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * Constraints:
    nums1.length == m
    nums2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -10^6 <= nums1[i], nums2[i] <= 10^6
    * https://leetcode.com/problems/median-of-two-sorted-arrays/description
 */

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        try {
            if ((nums1 == null || nums1.length == 0) && (nums2 == null || nums2.length == 0)) {
                throw new IllegalArgumentException("Both arrays are empty or null.");
            }

            if (nums1 == null || nums1.length == 0) {
                // System.out.println("nums of numslength/2"+nums2[nums2.length/2]);
                return (nums2.length % 2 == 0 ? (double) (nums2[nums2.length / 2] + nums2[(nums2.length / 2) - 1])/2
                        : nums2[nums2.length / 2]);
            }

            if (nums2 == null || nums2.length == 0) {
                return (nums1.length % 2 == 0 ? (double) (nums1[nums1.length / 2] + nums1[(nums1.length / 2) - 1])
                        : nums1[nums1.length / 2]);
            }
            int[] array = new int[nums1.length + nums2.length];
            System.arraycopy(nums1, 0, array, 0, nums1.length);
            System.arraycopy(nums2, 0, array, nums1.length, nums2.length);
            int max = nums1[nums1.length - 1] > nums2[nums2.length - 1] ? nums1[nums1.length - 1] : nums2[nums2.length - 1];
            int min = nums1[0] < nums2[0] ? nums1[0] : nums2[0];
            int exp = 1;
            // System.out.println(Arrays.toString(array));
            // System.out.println(Arrays.toString(countingSort(nums1, exp)));
            while (max / exp > 0) {
                countingSort(array, exp, max, min);
                exp *= 10;
            }
            System.out.println(Arrays.toString(array));
            return array.length % 2 == 0 ? (double) (array[array.length / 2] + array[(array.length / 2) - 1]) / 2
                    : array[array.length / 2];
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    public void countingSort(int[] array, int exp, int max, int min) {
        int countRange = max - min + 1;
        int[] count = new int[countRange];
        int[] output = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }
        // System.out.println(Arrays.toString(count));
        for (int i = 1; i < countRange; i++) {
            count[i] += count[i - 1];
        }
        // System.out.println(Arrays.toString(count));
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }
        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Solution sol = new Solution();
        final int[] nums1 = { 0, 0, 0, 0, 0 };
        final int[] nums2 = { -1, 0, 0, 0, 0, 0, 1 };
        System.out.println(sol.findMedianSortedArrays(nums1, nums2));
        // final int[] nums3 = { 1, 2 };
        // final int[] nums4 = { 3, 4 };
        // System.out.println(sol.findMedianSortedArrays(nums3, nums4));
        // final int[] nums5 = { };
        // final int[] nums6 = { 2,3 };
        // System.out.println(sol.findMedianSortedArrays(nums5, nums6));
        long endTime = System.nanoTime();
        System.out.println(endTime/1000000 - startTime/1000000 + "ms");
    }
}
