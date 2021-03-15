package ecnu.day01.demo01;
/*
重载：
1.参数个数
2.参数类型
3.与返回值无关
 */
public class Overload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
    }
    public static int sum(int a,int b) {
        return a+b;
    }
    public static int sum(int a,int b,int c) {
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d) {
        return a+b+c+d;
    }

}
