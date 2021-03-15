package ecnu.ObjectOriented.demo01;

import java.util.Scanner;

public class ObjectAnonymous {
    //匿名对象,只使用一次，一次性对象
    public static void main(String[] args) {
        new Person().name = "dlrb";
        int num = new Scanner(System.in).nextInt();
        //借助匿名函数使用一次Scanner
        System.out.println(num);
        methodParam(new Scanner(System.in));

        Scanner sc;
        sc = methodReturn();
        System.out.println(sc.nextInt());
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println(num);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
