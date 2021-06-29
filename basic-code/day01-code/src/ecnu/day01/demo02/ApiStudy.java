package ecnu.day01.demo02;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/*
    API：
    1.导包，2.创建，3.使用。
    java.lang不需要导包，lang表示language

 */
public class ApiStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入两个数字");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("两个数的和为："+sum);
        System.out.println("=========================");
        Random r = new Random();
        System.out.println(r.nextInt());//可能正负的int
        System.out.println(r.nextInt(5)+1);//[0,5) + 1 = [1,6)
        System.out.println("=========================");
        System.out.print("请输入一串字符");
        String str2 = sc.next();
        char[] chars = str2.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println("=========================");
        System.out.println(Math.abs(-1));//绝对值
        System.out.println(Math.ceil(0.1));//向上取整
        System.out.println(Math.floor(0.9));//向下取整
        System.out.println(Math.round(3.5));//四舍五入,小数变整数
        System.out.println(Math.PI);
    }

}
