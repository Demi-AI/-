import java.util.Scanner;
public class s411631020_11_12 {
    public static void main(String[] args) {
        /*
        int sum = 0;
        sum = 1*1;
        System.out.println("1-1 的平方和為：" + sum);
        sum += 2*2;
        System.out.println("1-2 的平方和為：" + sum);
        sum += 3*3;
        System.out.println("1-3 的平方和為：" + sum);

        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += i*i;
            System.out.println("1-" + i + "的平方和為:" + sum);
        }
        */

        int sum = 0, range, i;
        System.out.print("請輸入欲計算的奇數和範圍（結尾數值）：");
        Scanner sc = new Scanner(System.in);
        range = sc.nextInt();
        for(i=1; i<=range; i+=2){
            sum +=i;
        }
        System.out.println("1 到 " + range + "的所有奇數和為" + sum);
    }
}
