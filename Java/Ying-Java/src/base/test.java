package base;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*System.out.println("我是帅哥");
        //打印
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = sc.nextInt();
        System.out.println("请输入另一个数");
        int b = sc.nextInt();
        if(a % b == 0){
            System.out.println("整数a被整数b整除");
        }
        else if(a % b != 0){
            System.out.println("整数a不被整数b整除");*/

        Scanner sb = new Scanner(System.in);
        System.out.println("请输入自己的时髦度（1到10）");
        int my = sb.nextInt();
        if(my >= 1 && my <= 10){
            System.out.println("请输入相亲对象的时髦度（1到10）");
            int you = sb.nextInt();
            if(you >= 1 && you <= 10){
                if(my > you){
                    System.out.println("相亲成功");
                }
                else{
                    System.out.println("相亲失败");
                }
            }
            else{
                System.out.println("输入错误");
            }
        }
        else{
            System.out.println("输入错误");
        }
    }
}
