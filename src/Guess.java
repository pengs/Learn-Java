/*猜拳游戏*/
import java.util.Scanner;
public class Guess{
    public static void main(String[] args){
        System.out.println("---猜拳游戏---");
        System.out.println("请出拳：（1、剪刀 2、石头 3、布）");
        Scanner in=new Scanner(System.in);//Scanner类来获取用户的输入。
        int person=in.nextInt();//接收输入的数据
        int computer=(int)(Math.random()*3+1);//电脑随机输出，通过Math取随机数
        String Marks="";    //标记用户的手势
        String Marks1="";    //标记电脑的手势
        switch (person){
            case 1:
                Marks="剪刀";
                break;
            case 2:
                Marks="石头";
                break;
            case 3:
                Marks="布";
                break;
        }
        switch (computer){
            case 1:
                Marks1="剪刀";
                break;
            case 2:
                Marks1="石头";
                break;
            case 3:
                Marks1="布";
                break;
        }
        if (person<=0||person>3){

            System.out.println("您输入的数字不正确哟，无法匹配，请重新输入（1-3之间的整数）");

        }else if(person==computer){

            System.out.println("你出的是:"+Marks+";"+"电脑出的是:"+Marks1+"\n"+"是平局");

        }else if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){

            System.out.println("你出的是:"+Marks+";"+"电脑出的是:"+Marks1+"\n"+"你输了，电脑赢了哟");
        }else {

            System.out.println("你出的是:"+Marks+";"+"电脑出的是:"+Marks1+"\n"+"你赢了，开心吧，电脑输了！");
        }

    }

}
