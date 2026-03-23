class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num1 = nums1.clone();

        int p1 = 0, p2 = 0, i = 0;

        while (p1 < m && p2 < n) {
            if (num1[p1] <= nums2[p2]) {
                nums1[i] = num1[p1];
                p1++;
            } else {
                nums1[i] = nums2[p2];
                p2++;
            }
            i++;
        }

        while (p1 < m) {
            nums1[i++] = num1[p1++];
        }

        while (p2 < n) {
            nums1[i++] = nums2[p2++];
        }
    }
}
