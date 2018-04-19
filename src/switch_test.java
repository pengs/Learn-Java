import java.util.Scanner;

public class switch_test{

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入您的名次:");
        int mingci=input.nextInt();


        switch(mingci){//开关

            case 1://案例
                System.out.println("可以出任武林盟主");
                break;//跳出

            case 2:
                System.out.println("可以出任恒山掌门");
                break;//跳出

            case 3:
                System.out.println("可以出任内部盟主");
                break;//跳出

        }

    }


}