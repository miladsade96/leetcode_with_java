package merge_sorted_array;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Solution {

    /**
     * Solution for 88.MergeSortedArray LeetCode Challenge
     * BigO:
     * Time Complexity: O(m + n)
     * Space Complexity: O(1)
     *
     * @param nums1 First given array
     * @param m     number of non-zero items in nums1
     * @param nums2 Second given array
     * @param n     number of items in nums2
     * @return Sorted nums1
     */
    public static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int target = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums2[p2] > nums1[p1]) {
                nums1[target] = nums2[p2];
                p2--;
            } else if (nums1[p1] >= nums2[p2]) {
                nums1[target] = nums1[p1];
                p1--;
            }
            target--;
        }

        while (p2 >= 0) {
            nums1[target] = nums2[p2];
            target--;
            p2--;
        }
        return nums1;
    }
}
