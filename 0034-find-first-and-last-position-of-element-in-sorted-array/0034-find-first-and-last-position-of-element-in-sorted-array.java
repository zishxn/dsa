class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first  = firstOccurence(nums, 0, nums.length-1, target, Integer.MAX_VALUE);
        int last  = lastOccurence(nums, 0, nums.length-1, target, Integer.MIN_VALUE);
        return new int[]{first,last};
    }
    
    public int firstOccurence(int[] nums, int low, int high, int key, int minIdx){
        if(low > high){
            return -1;
        }
        int mid = low + (high-low)/2;
        if(key == nums[mid]){
            if(mid < minIdx){
                return firstOccurence(nums, low, mid,key,mid);
            } else {
                return mid;
            }
        }
        else if(key > nums[mid]){
            return firstOccurence(nums, mid+1, high,key,minIdx);    
        }
         else return firstOccurence(nums, low, mid-1, key, minIdx);
        
    }
        

    
    public int lastOccurence(int[] nums, int low, int high, int key, int maxIdx){
        if(low > high){
            return -1;
        }
        int mid = (int) Math.ceil((high + low) / 2.0);
        if(key == nums[mid]){
            if(mid > maxIdx){
                return lastOccurence(nums, mid, high,key,mid);
            } else return mid;
        }
        else if(key > nums[mid]){
            return lastOccurence(nums, mid+1, high,key,maxIdx);    
        }
        else return lastOccurence(nums, low, mid-1, key, maxIdx);
        
        
    }
    
}