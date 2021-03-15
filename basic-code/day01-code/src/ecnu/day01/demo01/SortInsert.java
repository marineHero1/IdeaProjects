package ecnu.day01.demo01;

import java.util.Scanner;

public class SortInsert {
    public static void main(String[] args) {
        int[] nums = {-1,3};
        int a = -3;
        int[] nums2 = fun(nums,a);
        for(int i:nums2){
            System.out.print(i+" ");
        }
    }
    public static int[] fun(int[] nums,int a){
        int len = nums.length + 1;
        int[] nums2 = new int[len];
        int flag = 0;
        for(int i=0;i<len-1;i++){
            if(flag==0) {
                if (a <= nums[i]) {
                    nums2[i] = a;
                    flag = 1;
                }else {
                    nums2[i] = nums[i];
                }
            }else{
                nums2[i] = nums[i-1];
            }
        }
        if(flag==0){
            nums2[len-1]=a;
        }else{
            nums2[len-1]=nums[len-2];
        }
        return nums2;
    }
}
