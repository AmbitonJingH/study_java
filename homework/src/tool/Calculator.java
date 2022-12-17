package tool;

public class Calculator {
    int num1;
    int num2;
    int num3;
    int num4;

    public Calculator(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public void add(){
        System.out.println("加法");
        int sum = this.num1+this.num2+this.num3+this.num4;
        boolean state;
        if(sum==10){
            state = true;
        }
        else{
            state = false;
        }

        if(state){
            System.out.println("加法计算正确");
        }
        else{
            System.out.println("加法计算错误");
        }

        System.out.println("加法结果："+sum);
    }
    public void sub(){
        System.out.println("减法");
        int sum = this.num3-this.num4;
        System.out.println("减法结果："+sum);
    }
    public void mul(){
        System.out.println("乘法");
        int sum = this.num3*this.num4;
        System.out.println("乘法结果："+sum);
    }
    public void div(){
        System.out.println("除法");
        float sum = (float)this.num3/(float)this.num4;
        System.out.println("除法结果："+sum);
    }

}
