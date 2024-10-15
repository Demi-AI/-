import java.util.Scanner; // 導入Scanner類
public class s411631020_10_15 {
    public static void main(String[] args) {
        /*
        boolean lightIsOn = false;
        System.out.println("現在有開燈嗎？" + lightIsOn);

        lightIsOn = !lightIsOn; // ！做反向運算
        System.out.println("現在有開燈嗎？" + lightIsOn);
        
        // 比較運算符號練習
        int i = 4, j = 5;
        boolean result = (i<j);
        System.out.println("當i = " + i + ", j = " + j);
        System.out.println("當i < j :" + result);
        System.out.println("當i <= j :" + (i<=j));
        System.out.println("當i > j :" + (i>j));
        System.out.println("當i >= j :" + (i>=j));
        System.out.println("當i == j :" + (i==j));
        System.out.println("當i != j :" + (i!=j));

        // 邏輯運算符號練習
        boolean a = true, b = false;
        System.out.println("a=" + a + ", b=" + b);
        // ＆ 與 && 是且(AND)的意思, 當兩個運算元都是true的時候, 結果就是true, 否則就是false
        System.out.println("a&b:" + (a&b));
        System.out.println("a&&b:" + (a&&b));
        // ｜ 與 ｜｜ 是或(OR)的意思, 當兩個運算元只要有一個是true的時候, 結果就是true, 兩個都是false, 結果就是false
        System.out.println("a|b:" + (a|b));
        System.out.println("a||b:" + (a||b));
        // 當兩個運算元不同時, 結果就是true, 否則就是false
        System.out.println("a^b:" + (a^b));

        // 題目練習
        int amount = 24000;
        double rate = 0.88;
        double total;
        int total_1;
        total = amount * (1 + rate);
        total_1 = (int)total; // (int)強制轉為整數型態
        System.out.println("一年本利和為：" + total_1);

        // 使用者輸入功能練習: 使用Scanner類
        Scanner scanner = new Scanner(System.in); // 創建Scanner對象、創建實例
        System.out.println("請輸入一個整數：");
        int number = scanner.nextInt(); // 讀取輸入
        System.out.println("你輸入的整數是：" + number);
        scanner.close(); // 關閉Scanner、釋放資源
        */

        //練習
        int people = 7;
        int Q, R;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入有幾個蘋果：");
        int apple = scanner.nextInt();
        Q = apple/people;
        R = apple%people;
        System.out.println("每人分" + Q +"個, 還剩" + R + "個");
    }
}
