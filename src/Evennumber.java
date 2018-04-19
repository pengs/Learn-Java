import java.util.Scanner;
public class Evennumber{

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int year=input.nextInt();
        if(year<=0){

            System.out.println("年份输入错误,请确认");
        }else if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+"输入是闰年");
            }else{
                System.out.println(year+"这是平年");
        }
    }

}


