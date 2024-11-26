import java.util.Scanner;
public class s411631020_11_26 {
    public static void main(String[] args){
        /*String cmd;
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        
        while(run){
            System.out.print("請輸入指令：");
            cmd = sc.next();
            if (cmd.equals("up")) {  // String == 不是判斷內容
                System.out.println("YC 向 " + cmd + " 移動");
            }
            if (cmd.equals("esc")) { 
                run = false; // exit game
            }
            switch(cmd){
                case "up":
                    System.out.println("YC 向 " + cmd + " 移動");
                    break;   
                case "down":
                    System.out.println("YC 向 " + cmd + " 移動");  
                    break;
                case "esc":
                    run = false;
                    break;
                default:
            }
        }
        System.out.println("game over");
        sc.close();
        
        // 巢狀迴圈
        // 九九乘法表練習
        for (int left=1; left<=9; left++) { // 外層迴圈從 left=1 開始
            for(int right=1; right<=9; right++){ // 內層迴圈從 right=1 開始
                System.out.print(left + "*" + right + "=" + left*right + "\t") ; // \t -> 4 space(空四格)
            }
            System.out.println(); // 換行
        } */

        /*
        input number : 5
        output:
        *****
        *****
        *****
        *****
        *****

        int num ;
        Scanner sc = new Scanner(System.in); // 上面有
        System.out.print("input number: ");
        num = sc.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){ 
                System.out.print("*");
            }
            System.out.println(); // 換行
        }
        */

        /*
        input number : 5
        output:
        *
        **
        ***
        ****
        *****
        
        System.out.print("Input Triangle layers: ");
        //Scanner sc = new Scanner(System.in); // 上面有
        int layer = sc.nextInt();
        for(int thisLayer=1; thisLayer<=layer; thisLayer++){
            // print star
            for(int star=1; star<=thisLayer; star++){
                System.out.print("*");
            }
            // enter (change line)
            System.out.println(); // 換行
        }

        int num_1 ;
        // Scanner sc = new Scanner(System.in); // 上面有
        System.out.print("input number: ");
        num_1 = sc.nextInt();
        for(int i=1; i<=num_1; i++){
            for(int j=1; j<=i; j++){ // 差別在 j<=i
                System.out.print("*");
            }
            System.out.println(); // 換行
        }

        */

        /*
        input number : 5
        output:
        *****
        ****
        ***
        **
        *

        int num_2 ;
        // Scanner sc = new Scanner(System.in); // 上面有
        System.out.print("input number: ");
        num_2 = sc.nextInt();
        for(int i=num_2; i>=1; i--){ // 差別在 int i=num_2; i>=i; i--
            for(int j=1; j<=i; j++){ 
                System.out.print("*");
            }
            System.out.println(); // 換行
        }
        sc.close();
        */

        /*
        outloop:for(int left=1; left<=9; left++){
            for(int right=1; right<=9; right++){
                if(left*right > 25){
                    System.out.println();
                    break outloop;
                }
                System.out.print(left + "*" + right + "=" + left*right + "\t");
            }
            System.out.println();
        }
        System.out.println("loop was done");
        */

        int sum = 0, range, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入奇數和的範圍: ");
        while (!sc.hasNextInt()) { 
            System.out.print("re-enter number: ");
            sc.next(); // 清除已輸入的內容！！
        }
        range = sc.nextInt();
        for(i=1; i<=range; i=i+2){
            sum +=i;
        }
        sc.close();
        System.out.println("total: " + sum);
    }
    
}
