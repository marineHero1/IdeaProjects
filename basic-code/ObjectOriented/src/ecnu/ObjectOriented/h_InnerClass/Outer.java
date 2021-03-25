package ecnu.ObjectOriented.h_InnerClass;

public class Outer {
    int num = 10;
    public class Inter{
        int num = 20;
        public void method(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            //使用外部类名+this调用外部类中的成员变量
            System.out.println(Outer.this.num);
        }
    }
}
