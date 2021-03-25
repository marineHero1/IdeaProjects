package ecnu.ObjectOriented.a_Extends;
/*
    父类与子类
    例如：父类是员工，子类是讲师

    优先调用子类中的内容！子类重写。
    重写（override）覆盖重写
    概念：在继承关系中，方法的名称一样，参数列表也一样
        *与重载不同，重载方法名称一样，但参数列表不同
    覆盖重写注意事项：
    1.子类中可选@Override检测覆盖重写是否正确
    2.子类方法的返回值必须【小于等于】父类方法的返回值的范围
        Object是返回值最高范围，最高父类（祖宗类）
    3.子类方法的权限必须【大于等于】父类的权限修饰符
        public > protected > (default) > private
        备注：default不是关键字，而是留空，什么都不写

    继承关系中，父子类【构造方法】的访问特点：
    1.子类构造方法中默认隐含一个super()调用，所以一定优先调用父类构造。
    2.子类构造中可以通过super()来进行父类重载构造
    3.super()必须是子类构造方法中的第一个语句
    总结：子类构造中必须调用父类构造，不写则赠送，super只能有一个，而且是第一个

    super关键字用法：
    1.访问父类成员变量；2.访问父类成员方法；3.访问父类的构造方法

    this关键字用法：用于访问本类
    1.访问本类成员变量；2.访问本类成员方法；
    3.在本类的构造方法中，访问另一个构造方法
    （3.这里this也必须第一个语句，且不能与supper构造同用）

    继承：是单继承，可以多级继承，一个父类可以有多个子类，但一个类只能有一个父类。
 */
public class Extends {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Assistant a = new Assistant();
        t.method();
        t.fun();
        a.method();
    }
}

//员工类
class Employee{
    int num = 10;
    public Employee(){
        System.out.println("Employee父类构造方法");
    }
    public void method(){
        System.out.println("员工方法执行");
    }
}

//讲师类
class Teacher extends Employee{
    int num = 20;

    //可选的安全检测：覆盖重写@Override
    @Override
    public void method(){
        super.method();//把父类的内容拿过来
        //子类中的新内容
        System.out.println("讲师方法执行");
    }
    public void fun(){
        int num = 30;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类的成员变量
        System.out.println(super.num);//父类的成员变量
    }
}

//助教类
class Assistant extends Employee{
    public Assistant(){
        super();
        //无论写不写都赠送super();
        System.out.println("Assistant子类构造方法");
    }
}