class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchInsertPosition(nums, target, 0, nums.length -1);
    }
    public static int searchInsertPosition(int[] arr, int key, int low, int high) {

        if (low > high) {
        
            return low;
        }

        int mid = (low + high) / 2;
        if (key == arr[mid]) {
           return mid;
        } else if (key > arr[mid]) {
            return searchInsertPosition(arr, key, mid + 1, high);
        } else {
            return searchInsertPosition(arr, key, low, high - 1);
        }

    }
}