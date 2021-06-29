package ecnu.day01.demo02;

import java.util.PriorityQueue;
import java.util.Queue;

public class ApiPriorityQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new PriorityQueue<>();//小顶堆，队列头部是堆中最小值，可以记忆从小到大
        Queue<Integer> queue1 = new PriorityQueue<>((x1,x2)->x2-x1);//大顶堆

        int[] nums = {3,2,5,7,9,10};
        for(int num:nums){
            queue1.offer(num);
            queue.offer(num);
        }
        //删除最前的数
        queue.poll();
        //删除最后的数
        queue.remove();
        System.out.println(queue1);
        System.out.println(queue);
    }
}
