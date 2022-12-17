package hero;

public class Gongben {
    String name;
    String sex;
    float gjl;
    float fyl;
    int bloodnum;
    boolean isopen = true;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public float getGjl() {
        return gjl;
    }

    public float getFyl() {
        return fyl;
    }

    public int getBloodnum() {
        return bloodnum;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public Gongben(String name, String sex, float gjl, float fyl, int bloodnum) {
        this.name = name;
        this.sex = sex;
        this.gjl = gjl;
        this.fyl = fyl;
        this.bloodnum = bloodnum;
    }

    public void firstaction(){
        System.out.println("*************************************");
        System.out.println(this.name+"发动了一技能");
        this.gjl = this.gjl+300.0f;
        this.fyl = this.fyl+300.0f;
        System.out.println("当前"+this.name+"攻击力为"+this.gjl);
        System.out.println("当前"+this.name+"防御力为"+this.fyl);
        System.out.println("*************************************");
    }

    public void secondaction(){
        System.out.println("*************************************");
        System.out.println(this.name+"发动了二技能");
        this.gjl = this.gjl+500.0f;
        this.fyl = this.fyl+300.0f;
        System.out.println("当前"+this.name+"攻击力为"+this.gjl);
        System.out.println("当前"+this.name+"防御力为"+this.fyl);
        System.out.println("*************************************");
    }

    public void thirdaction(){
        System.out.println("*************************************");
        System.out.println(this.name+"发动了三技能");
        this.gjl = this.gjl+700.0f;
        this.fyl = this.fyl+400.0f;
        System.out.println("当前"+this.name+"攻击力为"+this.gjl);
        System.out.println("当前"+this.name+"防御力为"+this.fyl);
        System.out.println("*************************************");
    }


    public void beiDong(){
        while(this.isopen){
            if(this.bloodnum<1000){
                System.out.println(this.name+"触发被动");
                this.bloodnum=this.bloodnum+1000;
                this.isopen = false;
                System.out.println(this.name+"当前血量"+this.bloodnum);
            }
            else{
                System.out.println(this.name+"现在满血");
            }
        }

    }
    public void subblood(float num){
        System.out.println(this.name+"被攻击");
        this.bloodnum=this.bloodnum-(int)num/2;
        if(this.bloodnum<0){
            System.out.println(this.name+"阵亡");
            System.out.println("游戏结束");
        }
        System.out.println(this.name+"当前血量"+this.bloodnum);
    }
    public void noraction(){
        System.out.println("*************************************");
        System.out.println(this.name+"平A");
        System.out.println("*************************************");
    }

}
