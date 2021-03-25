package ecnu.ObjectOriented.e_Interface;
/*
    必须【覆盖重写】所有的抽象方法
    注意事项：实现类不能覆盖重写解口中所有的抽象方法，那么这个实现类自己就必须是抽象类。

    java 8开始，接口里允许定义【默认方法，default】、【静态方法，static】
    【默认方法，default】用于解决解口升级的问题
    1.接口的默认方法，可以直接调用
    2.接口的默认方法，也可以通过接口实现类覆盖重写

    【静态方法，static】
    注意：不能通过接口实现类的对象来调用接口中的静态方法
    正确使用：通过接口名称，直接调用其中的静态方法

    java 9开始，接口中允许定义【私有方法，private】,用来解决重复代码的问题。
    1.普通私有方法    private
    2.静态私有方法    private static

    接口中的“成员变量”，接口中的【常量】，[public] [static] [final]三个关键字修饰，final说明不可改变
    注意事项：
    1.public static final可以省略，不写也是这样
    2.常量必须赋值，全部大写，用下划线连接。
 */
public class StudyInterface{
    public static void main(String[] args) {
        MyInterfaceAbstractImpl inter = new MyInterfaceAbstractImpl();
        inter.method1(1);
        inter.methodB();
        inter.methodAB();
        inter.methodDefault();//可以在接口中添加方法，而不用修改实现接口的类。

        //直接通过接口名称调用静态方法
        MyInterfaceAbstractA.methodStatic();

        //通过接口调用接口中的常量
        System.out.println(MyInterfaceAbstractA.NUM);
    }
}
/*
    接口就是多个类的公共规范。
    接口是一种引用数据类型，最重要的内容是：抽象方法

    关键字由class换成interface，编译之后依旧是.class文件

    Java 7，接口包括：
    1.常量、2.抽象方法

    Java 8，接口额外包括：
    3.默认方法、4.静态方法

    Java 9，接口额外包括：
    5.私有方法

    接口使用步骤：
    1.接口不能直接使用，必须有一个“实现类”来“实现”该接口
    格式：public class 实现类名称 implements 接口名称{
        // ...
    }
    2.接口的实现类必须【覆盖重写】实现接口中所有的抽象方法。
        实现：去掉abstract关键字，加上方法体大括号
    3.创建实现类的对象，进行使用
 */