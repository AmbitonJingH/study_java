package player;
import tool.Calculator;
public class player {

        private String name;//姓名
        private int age;//年龄
        private int num;//球衣号码
        private String qiuDui;//所效力的球队
        private String position;//场上位置
        private float height;//身高
        private float weight;//体重
        private String homeTown;//家乡
        private String habit;//惯用手

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getQiuDui() {
            return qiuDui;
        }

        public void setQiuDui(String qiuDui) {
            this.qiuDui = qiuDui;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public float getHeight() {
            return height;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        public float getWeight() {
            return weight;
        }

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHometown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getHabit() {
            return habit;
        }

        public void setHabit(String habit) {
            this.habit = habit;
        }
        static public void run(){
            System.out.println("跑步");
        }
        static public void jump(){
            System.out.println("跳");
        }
        public void dunk(){
            System.out.println("扣篮");
        }
        public void shoot(){
            System.out.println("投篮");
        }
        public void passBall(){
            System.out.println("传球");
        }
        public void useCalcu(){
            //创建一个计算器
        Calculator a = new Calculator(1,2,3,4);
        //使用某种方法
        a.add();
        a.sub();
        a.mul();
        a.div();
    }
        public static void main(String[] args) {

        }

}
