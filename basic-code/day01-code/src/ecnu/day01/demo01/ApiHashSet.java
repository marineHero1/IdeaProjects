package ecnu.day01.demo01;

import java.util.HashSet;

/*
    set.add(value);
    set.contains(value);
    set.size();
    set.remove(value);
 */
public class ApiHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.size());
        set.remove(1);
        System.out.println(set);
        //set值的获取使用for
        System.out.println(set.iterator().next());
    }
}
