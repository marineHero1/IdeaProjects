package ecnu.ObjectOriented.h_InnerClass;

public class InnerClass2 {
    public static void main(String[] args) {
        //外部类.内部类名称
        Outer.Inter obj = new Outer().new Inter();
        obj.method();
    }
}
