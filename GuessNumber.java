
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // 猜数游戏
        Random r = new Random();
        int n = r.nextInt(101);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请猜一个0-100之间的数：");
            int number = sc.nextInt();
            if (number == n) {
                System.out.println("恭喜你猜对了");
                break;
            }
            else if (number > n && number <= 100) {
                System.out.println("有一点点大了哦");
            }
            else if (number < n && number >= 0) {
                System.out.println("有一点点小了哦");
            }
            else {
                System.out.println("请重新输入");
            }
        }
    }
}
