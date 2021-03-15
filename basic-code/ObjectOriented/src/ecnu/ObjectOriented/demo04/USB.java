package ecnu.ObjectOriented.demo04;
/*
    任何版本，接口都能定义抽象方法

    抽象方法格式：
    public abstract 返回值类型 方法名(参数列表);

    注意事项：
    1.接口中的抽象方法，修饰符必须是两个固定的关键字：public abstract
    2.这两个关键字修饰符可以选择性的忽略（但是不推荐）
    3.方法的三要素（方法名、返回值、参数列表）可以随意定义
 */
public interface USB {
    public abstract void open();
    public abstract void close();
}
