//求1970年到2018年相隔多少天
public class day {
    public static void main(String[] args){
        int sum=0;
        for (int year=1970;year<=2018;year++){
            if (year%4==0&&year%100!=0||year%400==0){
                sum+=366;//闰年
            }else {
                sum+=365;//平年
            }
        }
        System.out.println("1970年到2018年相隔:"+sum+"天");
    }
}
