package ecnu.day01.demo02;

import java.util.ArrayList;
/*
    声明方法：
        ArrayList<Integer> list = new ArrayList<Integer>();
        <>中必须是引用类型！！不能是基本类型，但可以使用基本类型的“包装类”
            基本类型    包装类（引用类型，位于java.lang下）
            byte        Byte
            short       Short
            int         Integer     【特殊】
            long        Long
            float       Float
            double      Double
            char        Character       【特殊】
            boolean     Boolean
        JDK1.5以后可以自动转换：自动装箱、自动拆箱
            自动装箱：基本类型 -->包装类型
            自动拆箱：包装类型 -->基本类型
    常用方法：
        add(E e) 向集合中添加元素,返回值为true
        get(int index) 从集合中获得元素
        remove(int index) 从集合中删除并获取元素
        size() 返回集合的尺寸长度
        subList(0,k) 返回0到k的list
    Collections:
        Collections.sort()排序
        Collections.reverse()反转
 */
public class ApiArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //直接打印不是地址值，而是列表内容
        System.out.println(list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i=0;i<list.size();i++){//list.fori通过idea可以自动生成这一行
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.subList(0,3));
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.remove(i)+" ");
        }
        System.out.println(list.getClass());
        System.out.println(list);



    }
}
