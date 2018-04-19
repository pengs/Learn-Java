//循环嵌套结构
import java.util.Scanner;
public class if_else{
    public  static  void main(String [] args){

        Scanner input =new Scanner(System.in);
        System.out.println("请输入三个整数:");
        int A=input.nextInt();//接收输入数值
        int B=input.nextInt();
        int C=input.nextInt();

        if(A == B && B == C) {
            System.out.println("您输入的三个数是相等的");
        }else if (A+B+C>1000){
            System.out.println("三个数之和大于1000");
        }else {
            System.out.println("三个数之和不大于1000");
        }
    }
}

