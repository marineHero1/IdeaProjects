package ecnu.day01.demo01;
/*
    java.lang.String类代表字符串
    字符串的特点：
        1.内容永不可变
        2.因为不可变，所以可以共享使用
        3.字符串效果上是相当于char[]字符数组，但是底层原理是byte[]字节数组
    创建字符串的3+1种方法：
        public String();    创建一个空白字符串
        public String(char[] array);    根据字符数组，来创建对应的字符串
        public String(byte[] array);    根据字节数组，来创建对应的字符串
        String str = "123";
    字符串常量池：程序种直接写上的双引号字符串，就在字符串常量池中。
 */
public class StringStudy {
    public static void main(String[] args) {
        //字符串创建及字符串的常量池
        //fun1();

        //字符串内容比较 .equals方法
        //fun2();

        //字符串常用方法：
        // .length()字符串长度
        // .concat当前字符串与参数字符串拼接返回
        // .charAt返回索引位置的单个字符
        // .indexOf查找字符串中参数字符首次出现的索引位置，若没有返回-1
        // .substring(int index)截取从index到末尾
        // .substring(int begin, int end)截取[begin,end)的字符串
        // .toCharArray()将当前字符串变成字符数组返回
        // .getBytes()获得当前字符串底层的字节数组
        // .replace(oldString,newString)将字符串中oldString替换为newString，并返回变换后的字符串

        // .split(regexString)按照参数规则regexString切分字符串，返回字符串数组
        // regex是一个正则表达式，如果使用英文句点"."进行切分，必须"\\."
        // s.trim()去除首尾空格

        //Integer.parseInt(str)  str-to-int
        //Integer.toString(int)  int-to-str
        String str = "aaa.bbb.ccc";
        // .compareTo(数字字符串) 数字字符串之间进行比较，大返回1，等返回0，小返回-1
        System.out.println("21".compareTo("20"));;

        System.out.println("-3".compareTo("-2"));;
        String[] strArray = str.split("\\.");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }
    public static void fun1(){
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串"+str1);
        //根据字符数组创建字符串
        char[] array = {'a','b','c'};
        String str2 = new String(array);
        System.out.println("第二个字符串"+str2);
        //根据字节数组创建字符串
        byte[] array2 = {97,98,99};
        String str3 = new String(array2);
        System.out.println("第三个字符串"+str3);
        //直接创建
        String str4 = "abc";//在字符串常量池中,在堆中，生成一个byte[]存储
        System.out.println("第四个字符串"+str4);

        System.out.println(str3 == str4);//地址比较
    }
    public static void fun2(){
        String str1 = "Hello";
        String str2 = "Hello";
        char[] array = {'H','e','l','l','o'};
        String str3 = new String(array);
        //字符串内容比较 .equals方法
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println("hello".equalsIgnoreCase(str3));//忽略大小写比较
        System.out.println("Hello".equals(str1));//常量和变量比较的推荐写法
    }
}
