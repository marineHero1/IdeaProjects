package ecnu.day01.demo01;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int len = array.length;
        for(int min=0,max=len-1; min < max ;min++,max--){
            array[min] = array[min]+array[max];
            array[max] = array[min]-array[max];
            array[min] = array[min]-array[max];
        }
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
