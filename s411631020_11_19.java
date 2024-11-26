import java.io.*;
public class s411631020_11_19 {    
    public static void main(String[] args) throws IOException {
        int sum = 0, range;
        System.out.print("請輸入欲計算的偶數和範圍(結尾數值):");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        String str = br.readLine();
        range = Integer.parseInt(str);
        int i=0; // 宣告迴圈變數 i
        while(i<=range){ //當i值大於range 即停止執行的 while 迴圈
            sum += i;
            i += 2;
        } // 每次都將 i 值加2
        System.out.println("1 到 "+range+"的所有偶數和為"+sum);
    }
}
