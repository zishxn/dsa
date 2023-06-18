class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length -1, target);
    }
    private static int binarySearch(int[] arr, int low, int high, int key){
        if(low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == key){
            return mid;
        } else if(key < arr[mid]){
            return binarySearch(arr,low,mid-1,key);
        } else return binarySearch(arr,mid+1,high,key);
    }
}