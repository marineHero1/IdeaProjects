package ecnu.ObjectOriented.i_nimingInnerClass;
/*
    匿名内部类：
    1.匿名内部类，在【创建对象】的时候，只能使用唯一的一次。
    2.匿名对象，在【调用方法】的时候，只能调用唯一的一次。
    3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj = new MyIntrfaceImpl();
//        obj.method();
        //匿名内部类生成匿名对象
        MyInterface some = new MyInterface(){
            @Override
            public void method1(){
                System.out.println("匿名内部类实现了接口方法111-A");
            }
            @Override
            public void method2(){
                System.out.println("匿名内部类实现了接口方法222-A");
            }
        };
        some.method1();

        //匿名对象
        new MyInterface(){
            @Override
            public void method1(){
                System.out.println("匿名内部类实现了接口方法111-B");
            }
            @Override
            public void method2(){
                System.out.println("匿名内部类实现了接口方法222-B");
            }
        }.method2();
    }
}
