package cn.iwwzc.traverse;

import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
     // 需求：生成5个1-20的随机数，让用户猜，若猜中提示猜中，还要输出该数据在数组中第一次出现的索引,并打印数组内容，没猜中继续

     // 定义动态初始化数据存储5个1-20的随机数
     int[] data = new int[5];
     // 动态生成5个随机数并赋值到数组中
     Random r = new Random();
     for (int i = 0; i < data.length; i++) {
        // i 0 1 2 3 4
        data[i] = r.nextInt(20) + 1;
     }
     // 使用一个死循环让用户猜
     Scanner sc =new Scanner(System.in);
     OUT:
     while (true) {
        System.out.println("请输入一个1-20的数：");
         int guess = sc.nextInt();

         // 遍历每一个数据，看是否有数据与猜测数据相同，相同代表猜中
         for (int i = 0; i < data.length; i++) {
            if (data[i] == guess){
                System.out.println("恭喜你猜中了，运气不错哦！你猜中的数据索引是：" + i);
                break OUT; // 结束整个死循环
            }
         }
         System.out.println("无法找到当前数据，请重新猜测！");
     }
     // 输出数组的全部元素，让用户看到自己确实猜中了数据
     System.out.println("全部数据有：");
     for (int i = 0; i < data.length; i++) {
        
        System.out.print(data[i] + "\t");
     }
    }
}
