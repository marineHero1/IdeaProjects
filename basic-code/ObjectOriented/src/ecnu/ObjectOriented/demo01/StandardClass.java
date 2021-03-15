package ecnu.ObjectOriented.demo01;
/*
    标准的类需要四个部分:
    1.所有成员变量都要使用private关键字
    2.为每个成员变量编写一堆Getter/Setter方法
    3.编写一个无参的构造方法
    4.编写一个全参数的构造方法

    标准的类也叫做Java Bean
 */
public class StandardClass {
    static String room;
    private static int idcount=0;
    private String name;
    private int age;
    private int id;

    public StandardClass() {
        this.id=++idcount;
    }

    public StandardClass(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idcount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
}
