package background;

import cals.Calculator;
import menu.Calsmenu;

import java.util.Scanner;

public class Game01 {

    public static void main(String[] args) {
        Calsmenu calsmenu = new Calsmenu();
        while (true) {
            calsmenu.menu1();
            Calculator calcu = new Calculator();
            Scanner sc = new Scanner(System.in);
            float x = 0.0f;
            float y = 0.0f;
            System.out.println("请输入要计算的第一个数（x）");
            x = sc.nextFloat();
            System.out.println("请输入要计算的第二个数（y）");
            y = sc.nextFloat();
            System.out.println("请选择你的操作");
            int a = sc.nextInt();
            System.out.println("输入的值为" + a);
            switch (a) {
                case 1:
                    //1.计算加法
                    calcu.add(x, y);
                    break;
                case 2:
                    //1.计算减法
                    calcu.sub(x, y);
                    break;
                case 3:
                    //1.计算乘法
                    calcu.mul(x, y);
                    break;
                case 4:
                    //1.计算除法
                    calcu.div(x, y);
                    break;
                case 5:
                    //1.计算n次法
                    calcu.n_chengfa(x, y);
                    break;
                default:
                    //输入错误
                    System.out.println("输入错误！");
                    break;
            }
        }
    }
}
