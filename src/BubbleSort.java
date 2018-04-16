import java.util.Arrays;

public class BubbleSort{

    public static void main(String[] args){
        int[] sortNum = {12,33,28,86,15,62,9,38};       //定义数组
        bubbleSort(sortNum);                           //开始排序
        System.out.println(Arrays.toString(sortNum));   //打印结果
    }


    private static void bubbleSort(int[] sortNum){
        int temp = 0;
        for (int i = 0; i < sortNum.length-1; i++) {         //第一个for循环控制排序要走多少趟，最多做n-1趟排序
            for (int j = sortNum.length-1; j > i; j--) {     //第2个for循环控制每趟比较多少次
                if(sortNum[j-1]>sortNum[j]){                 //大的往后面排
                        temp = sortNum[j-1];
                        sortNum[j-1] = sortNum[j];
                        sortNum[j] = temp;
                    }
                }
            }
        }
}


