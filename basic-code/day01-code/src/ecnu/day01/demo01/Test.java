package ecnu.day01.demo01;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        Arrays.sort(nums);
        String str = "1234";
        System.out.println("123".substring(3));
        System.out.println("123".substring(2));
        System.out.println("123".substring(0,3));
        System.out.println("123".substring(0,0));
        System.out.println(-1024==-1024);
        System.out.println("=========");
        Arrays.sort(nums);

    }


}
class MinStack {
    int min = Integer.MAX_VALUE;
    Deque<Integer> stackMin;
    Deque<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stackMin = new LinkedList<>();
        stack = new LinkedList<>();
        stackMin.push(min);
    }

    public void push(int x) {
        stack.push(x);
        if(stackMin.peek()>=x){
            stackMin.push(x);
        }
    }

    public void pop() {
        if(stackMin.peek()==stack.peek()){
            stackMin.pop();
        }
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}
