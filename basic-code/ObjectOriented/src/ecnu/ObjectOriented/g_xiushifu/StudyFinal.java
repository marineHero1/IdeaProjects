package ecnu.ObjectOriented.g_xiushifu;
/*
    final关键字代表最终、不可改变的
    注意：类和方法，abstract与final不能同时使用，因为矛盾

    常见四种用法：
    1.修饰类 public final class 类名称{}
        不能有任何子类，（太监类），其中所有的成员方法都无法进行覆盖重写（因为没儿子。）
    2.修饰方法 public final void method(){};
        final修饰的方法不能被覆盖重写
    3.修饰局部变量 final int num=10;
        “一次赋值，终生不变”       final int num;
                                num=30;//是正确的
        Tip:基本类型（变量中的数据不可变）与引用类型（变量中的地址值不可变，变量的内容可变）
    4.修饰成员变量
        1）成员变量会有默认值，所以用了final之后必须手动赋值
        2）final要么使用直接赋值，要么通过构造方法赋值，两者选其一
        3)类中的所有重载的构造方法，都会对final的成员变量进行赋值
 */
public class StudyFinal {
}
