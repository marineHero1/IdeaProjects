package ecnu.ObjectOriented.a_Extends;
/*
    构造方法
    public 类名称(参数类型 参数名称){
        方法体
    }
    注意：
    1.构造方法名与类名完全一致
    2.构造方法不写返回值类型，void也不写
    3.构造方法不能有return
    4.如果没有定义构造方法，编译器会赠送一个没有语句的构造方法
    5.写了构造方法就不会赠送
    6.构造方法也可以重载！!
 */
public class Person {
    static String room;//静态static属于所在的类
    String name;
    private int age;
    //类内随意访问，类外不能直接访问,类外通过方法间接访问

    public Person(){
    }

    public Person(String name){
        this.name=name;
        //System.out.println("name被赋值了");
        //不可以有return
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        //System.out.println("name、age被赋值了");
        //不可以有return
    }

    public void talk(){
        System.out.println("My name is:"+name);
    }

    //设置年龄Age，不可改名
    public void setAge(int age){
        if(age<100 && age>0) {
            this.age = age;
            //this代表实例化类的地址
        }else{
            System.out.println("Age数据不合理");
        }
    }

    //获得年龄Age，不可改名
    public int getAge(){
        return age;
    }
}
