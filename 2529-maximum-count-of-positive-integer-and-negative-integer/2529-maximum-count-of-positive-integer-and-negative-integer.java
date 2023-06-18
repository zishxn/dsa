class Solution {
    public int maximumCount(int[] nums) {
        // int[] nums = {-3,-2,-1,0,0,1,2};
        int minIndexOfPositiveNumber = searchPositive(nums, 0, nums.length -1, Integer.MAX_VALUE);
        System.out.println("minIndexOfPositiveNumber "+ minIndexOfPositiveNumber);
        int maxIndexOfNegativeNumber = searchNegative(nums, 0, nums.length -1, Integer.MIN_VALUE);
        System.out.println("maxIndexOfNegativeNumber "+ maxIndexOfNegativeNumber);
        int arrIdx = nums.length -1;
        if(minIndexOfPositiveNumber == -1 && maxIndexOfNegativeNumber == -1)
            return 0;
        if(minIndexOfPositiveNumber == -1)
            return maxIndexOfNegativeNumber + 1;
        if(maxIndexOfNegativeNumber == -1)
            return nums.length - minIndexOfPositiveNumber;
        return Math.max((nums.length - minIndexOfPositiveNumber),maxIndexOfNegativeNumber+1);
    }
    private static int searchNegative(int[] arr, int low, int high, int maxIdx){
        if (low > high) {
            return -1;
        }
        int mid = (int) Math.ceil((high + low)/2.0);
        if (arr[mid] < 0 ) {
            if (mid > maxIdx) {
                return searchNegative(arr, mid, high, mid);
            } else return mid;
        } else return searchNegative(arr, low, mid-1, maxIdx);
    }


    private static int searchPositive(int[] arr, int low, int high, int minIdx){
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] > 0 ) {
            if (mid < minIdx) {
                return searchPositive(arr, low, mid, mid);
            } else return mid;
        } else return searchPositive(arr, mid + 1, high, minIdx);
    }
}