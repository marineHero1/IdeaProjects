package ecnu.ObjectOriented.demo08;

public class Body {
    public class Heart{
        //内部类方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我的名字是"+name);
        }
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Body(String name) {
        this.name = name;
    }

    public Body() {
    }

    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }
}
