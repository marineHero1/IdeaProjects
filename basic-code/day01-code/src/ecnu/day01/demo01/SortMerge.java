package ecnu.day01.demo01;
import java.util.Scanner;
public class SortMerge {
    private static int[] temp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        temp = new int[nums.length];
        mergeSort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void mergeSort(int[] nums,int left,int right){
        if(left >= right) return;
        int mid = (left+right)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
    public static void merge(int[] nums,int left,int mid,int right){
        int i=left,j=mid+1,k=left;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid) temp[k++]=nums[i++];
        while(j<=right) temp[k++]=nums[j++];
        for(int m=left;m<=right;m++){
            nums[m]=temp[m];
        }

    }
}

