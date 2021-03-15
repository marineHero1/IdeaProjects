package ecnu.day01.demo01;
//数组，数组定义之后长度无法改变，且只能存储同一种数据类型
//初始化数组默认值：
//整型为0，浮点类型为0.0，字符串类型为'\u0000'，布尔类型为false，引用类型为null。
public class Array {
    public static void main(String[] args) {
        //静态定义，确定数组内容时使用
        int[] a1 = new int[] {1,2,3};
        int[] a2 = {1,2,3};
        /*错误
        int[] a3;
        a3= {1,2,3};
        */
        //动态定义,不确定数组内容时使用
        int[] b1 = new int[10];
        String[] b2;
        b2 = new String[10];

        System.out.println(a1);//打印数组a1内存地址16进制0x666
        int[] c=a1;//传址赋值c中元素改变，a1元素也改变
        System.out.println(c);
        printArray(c);//数组作为参数和返回值都是传址
    }
    public static int[] printArray(int[] array){
        array[0]=100;
        return array;

    }
}
