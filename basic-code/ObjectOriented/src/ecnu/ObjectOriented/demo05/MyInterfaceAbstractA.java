package ecnu.ObjectOriented.demo05;
//  java 9中还可以有私有方法
/*
    注意事项：
    1.接口不能有静态代码块  static{         }
    接口不能有构造方法
    2.一个类的直接父亲是唯一的，但是可以实现多个接口【类与类是单继承的，类与接口是多实现的，接口与接口是多继承的】
    3.必须对冲突的默认方法进行重写
    4.父类中的方法和接口中的方法冲突，优先执行父类中的方法【继承优先于接口】
 */
public interface MyInterfaceAbstractA {
    //常量，建议大写
    public static final int NUM=10;

    //接口默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }

    //接口静态方法，智能通过接口名称进行调用
    public  static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }

    //抽象方法
    public abstract void method1(int num);

    public abstract void method2();

    public abstract void methodAB();
}
