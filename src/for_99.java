import java.util.*;
public class for_99 {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
     for (;;){
         System.out.println("还跑吗？");
         String flag=in.next();
         if (flag.equals("YES")){
             System.out.println("继续坚持跑完");
         }else {
             break;
         }
     }
    }
}

//利用for循环打印一个菱形

