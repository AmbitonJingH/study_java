package cals;

public class Calculator {
    float num1;
    float num2;



    public void add(float num1,float num2){
        System.out.println("加法");
        float sum = num1+num2;
        /*boolean state;
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
        }*/
        System.out.println("加法结果："+sum);
    }
    public void sub(float num1,float num2){
        System.out.println("减法");
        float sum = num1-num2;
        System.out.println("减法结果："+sum);
    }
    public void mul(float num1,float num2){
        System.out.println("乘法");
        float sum = num2*num2;
        System.out.println("乘法结果："+sum);
    }
    public void div(float num1,float num2){
        System.out.println("除法");
        float sum = num1/num2;
        System.out.println("除法结果："+sum);
    }
    public void n_chengfa(float num1,float num2){
        System.out.println("次方运算");
        int n = (int) num2;
        float res = 1.0f;
        for(int j=0;j<n;j++){
            res = res * num1;
            if(res<=2147483647.0f&&res>=-2147483648.0f){

            }else{
                System.out.println("数据异常无法计算！");
                System.out.println(num1 + "的" + num2 + "次方是：" + (int)res);
            }
        }
        /* do{
            res = res * num1;
            n = n-1;
        }while(n!=-1&&res<=2147483647.0f&&res>=-2147483648.0f);
        if(n!=-1){
            System.out.println("数据异常无法计算！");
        }*/
        /*while(n!=0){
            res = res * num1;
            n = n-1;
        }*/
        if(res<=2147483647.0f&&res>=-2147483648.0f) {
            System.out.println(num1 + "的" + num2 + "次方是：" + res);
        }
    }


    static void test(){
        int a = 10;
        int b = 10;
        while(true) {
            if (b < 10 && compare()) {
                System.out.println("进来了");
                break;
            } else {
                b = 20;
            }
        }
    }
    static boolean compare(){
        System.out.println("compare");
        return true;
    }

    public static void main(String[] args) {
        test();
    }


}
