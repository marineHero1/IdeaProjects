package ecnu.ObjectOriented.j_chengyuanbianliang;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("上官婉儿");
        //匿名对象作为参数
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu");
            }
        });
        hero.useSkill();
    }
}
