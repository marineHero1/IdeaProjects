package ecnu.day01.demo02;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
/*
    .offer()
    .peek()
    .poll()
    .size()
 */
public class ApiQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());

    }
}