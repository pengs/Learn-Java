import java.util.Scanner;
public class Guess {
    public static void main(String[] args){
        System.out.println("---猜拳游戏----");
        System.out.println("请出拳：（1、剪刀 2、石头 3、布）");
        Scanner in=new Scanner(System.in);
        int person=in.nextInt();
        int computer=(int)(Math.random()*3)+1;//电脑输入随机数
        String Marks="拳头";//这个是做一个标记
        String Marks1="石头";
        switch(person){
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
        switch(computer){
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
        if(person==computer)
        {
            System.out.println("你出的是:"+Marks+";"+"电脑出的是:"+Marks+"\n"+"是平局");
        }
        else if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1)
        {
            System.out.println("你出的是:"+Marks+";"+"电脑出的是:"+Marks1+"\n"+"你输了");
        }
        else
        {
            System.out.println("你出的是:"+Marks+";"+"电脑出的是:"+Marks1+"\n"+"你赢了");
        }
    }

}
