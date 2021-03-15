package ecnu.ObjectOriented.demo06;

public class Zi extends Fu{
    int num=10;
    @Override
    public void method(){
        System.out.println("子类实现");
    }
    public void methodZi(){
        System.out.println("子类中特有方法");
    }
}
