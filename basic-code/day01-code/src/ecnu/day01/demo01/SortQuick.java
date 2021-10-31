package ecnu.day01.demo01;

public class SortQuick {
    public static void main(String[] args) {
        int[] nums = {2,3,11,2,12,13,14,5,13,2,1,5,3,6};
        sort(nums,0,nums.length-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    public static void sort(int[] nums,int left,int right){
        if(left<right){
            int key = exchange(nums,left,right);
            sort(nums,left,key-1);
            sort(nums,key+1,right);
        }
    }
    public static int exchange(int[] nums,int left,int right){
        int key = nums[left];
        while(left<right){
            while(right>left && nums[right]>=key){
                right--;
            }
            nums[left] = nums[right];
            while(left<right && nums[left]<=key){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = key;
        return left;
    }
}

