package ecnu.ObjectOriented.demo08;
/*
    内用外随意；外用内需要内部类对象
 */
public class InnerClass {
    public static void main(String[] args) {
        Body body = new Body("dxy");//外部类的对象
        //通过外部类的对象，间接使用内部类Heart
        body.methodBody();

        System.out.println("===============");
        //公式：外.内
        Body.Heart heart = new Body("dxy").new Heart();
        heart.beat();
    }
}
