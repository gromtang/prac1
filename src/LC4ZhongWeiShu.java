public class LC4ZhongWeiShu {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[(nums1.length + nums2.length) / 2 + 1];
        int i = 0,j = 0, k = 0;
        while (i < nums1.length && j < nums2.length && k < arr.length) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        while (k < arr.length && i < nums1.length) arr[k++] = nums1[i++];
        while (k < arr.length && j < nums2.length) arr[k++] = nums2[j++];

        if ((nums1.length + nums2.length) % 2 == 1) {
            return arr[k - 1];
        } else {
            return (double) (arr[k - 1] + arr[k - 2])/2;
        }

    }
}
