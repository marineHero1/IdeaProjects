package ecnu.day01.demo02;
import java.util.Random;
public class ApiRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();//int范围任意值
        int num2 = r.nextInt(3);//[0,3)
        System.out.println(num);
        System.out.println(num2);
    }
}
