package ecnu.ObjectOriented.j_chengyuanbianliang;

public class Hero {
    private String name;
    private Skill skill;

    public void useSkill(){
        System.out.println(name + "正在施放技能");
        skill.use();
        System.out.println("技能施放完毕");
    }

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
