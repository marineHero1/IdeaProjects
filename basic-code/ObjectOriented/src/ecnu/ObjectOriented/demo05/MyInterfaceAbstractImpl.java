package ecnu.ObjectOriented.demo05;

public class MyInterfaceAbstractImpl /*extends Object*/ implements MyInterfaceAbstractA,MyInterfaceAbstractB {
    //覆盖重写默认方法
    @Override
    public void methodDefault() {
        System.out.println("重写接口中的默认方法");
    }

    @Override
    public void methodAB(){
        System.out.println("AB都有的抽象方法");
    }

    @Override
    public void method1(int num) {
        System.out.println(num+"method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了接口B的methodB方法");
    }
}
