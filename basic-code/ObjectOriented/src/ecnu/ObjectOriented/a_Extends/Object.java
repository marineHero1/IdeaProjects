package ecnu.ObjectOriented.a_Extends;
/*
    面向对象三大特征：封装、继承和多态。

    封装性：
    1.方法是一种封装
    2.关键字private是一种封装
    （类内随意访问，类外不能直接访问,类外通过方法间接访问）

    static静态方法注意：
    1.静态不能访问成员变量，静态不能访问非静态内容。
    2.静态不能使用this关键字
 */
public class Object {
    public static void main(String[] args) {
        Person p1 = new Person("dxy",18);
        Person p2 = new Person("cqy",19);
        p1.room = "22班";
        p1.setAge(19);
        //p1.talk();
        //System.out.println("Age:" + p1.getAge());
        //System.out.println("p2的班级："+p2.room);

        StandardClass student =new StandardClass("dxy",19);
        System.out.println(student.getAge()+"岁的"+student.getName()
                +",学号是"+student.getId());

        StandardClass student2 =new StandardClass("cqy",20);
        System.out.println(student2.getAge()+"岁的"+student2.getName()
                +",学号是"+student2.getId());

        StandardClass student3 =new StandardClass("cy",1);
        System.out.println(student3.getAge()+"岁的"+student3.getName()
                +",学号是"+student3.getId());
        //对象数组
        StandardClass[] ps = new StandardClass[3];
        ps[0] = student;
        ps[1] = student2;
        ps[2] = student3;
    }
}
