import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int index = -1;
            int next = -1;

            // Find the index of nums1[i] in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }

            // Find the next greater element
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    next = nums2[j];
                    break;
                }
            }

            result[i] = next;
        }

        return result;
    }
}
