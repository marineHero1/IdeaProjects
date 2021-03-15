package ecnu.ObjectOriented.demo02;
/*
    抽象类、抽象方法加上abstract关键字

    抽象使用：
    1.不能直接new创建抽象对象
    2.只能通过子类来继承抽象父类
    3.子类必须【覆盖重写】抽象父类中的【所有】抽象方法
    4.创建子类对象进行使用

    注意事项：
    1.抽象类中不一定有抽象方法，抽象方法一定在抽象类中。
    2.子类必须重写父类所有的抽象方法，否则子类也是抽象类。
 */
public class Abstract {
    public static void main(String[] args) {
        Cat cat1 =  new Cat();
        cat1.eat();
    }
}
