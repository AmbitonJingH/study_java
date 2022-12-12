public class God {
    public static void main(String[] args) {
        player p = new player();
        p.setName("LeBron James");
        p.setAge(38);
        p.setNum(6);
        p.setQiuDui("洛杉矶湖人队");
        p.setPosition("小前锋");
        p.setHeight(206);
        p.setWeight(113);
        p.setHometown("美国俄亥俄州阿克伦");
        p.setHabit("右手");


        System.out.println(p.getName());
        System.out.println(p.getNum());
        System.out.print(p.getHeight());
        System.out.println("cm");
        System.out.print(p.getWeight());
        System.out.println("kg");
        System.out.println(p.getAge());
        System.out.println(p.getQiuDui());

        p.passBall();
        p.dunk();
        p.shoot();
    }
}
