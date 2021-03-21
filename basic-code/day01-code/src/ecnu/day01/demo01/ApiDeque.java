package ecnu.day01.demo01;

import java.util.Deque;
import java.util.LinkedList;

public class ApiDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();
        //栈，先入后出
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        int i=1999;
        int j=1999;
        System.out.println(i==j);
        Integer m=1999;
        Integer n=1999;
        System.out.println(m==n);
        System.out.println(m.equals(n));
    }
}
