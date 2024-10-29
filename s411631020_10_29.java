import java.util.Scanner;
public class s411631020_10_29 {
    public static void main(String[] args){
        /*
        boolean award = true;
        if(award == true){
            System.out.println("travel around the world");
        }else{
            System.out.println("travel channel");
        }

        double hight;
        System.out.print("input hight ? ");
        Scanner sc = new Scanner(System.in);
        hight = sc.nextDouble();
        if(hight > 120){
            System.out.println("buy full ticket");
        }else if(hight <= 120 && hight > 90){
            System.out.println("buy half-ticket");
        }else{
            System.out.println("just free");
        }
        
        // switch 多條件分支（多選一）
        System.out.print("input stud_ID first char? ");
        Scanner sc = new Scanner(System.in);
        String firstChar = sc.next();
        switch (firstChar){
            case "4": // 如果是 int 就直接打,不用加“”
                System.out.println("大學生");
                break;
            case "6":
                System.out.println("研究生");
                break;
            case "8":
                System.out.println("博士生");
                break;
            default: // 避免直接跳開,可以重新輸入
                System.out.println("請重新輸入： ");
                break;
        }
        sc.close();

        System.out.print("input season number? ");
        Scanner sc = new Scanner(System.in);
        int season = sc.nextInt();
        switch (season){
            case 1: // 如果是 int 就直接打,不用加“”
                System.out.println("Long T-shirt");
                break;
            case 2:
                System.out.println("Short T-shirt");
                break;
            case 3:
                System.out.println("Short T-shirt");
                break;
            case 4:
                System.out.println("Long T-shirt");
                break;
            default: // 避免直接跳開,可以重新輸入
                System.out.println("revise your number");
                break;
        }
        sc.close();
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Gender? ");
        String gender = sc.nextLine();
        System.out.print("Input Age? ");
        int age = sc.nextInt();
        switch (gender){
            case "F": // 如果是 int 就直接打,不用加“”
                if(age >= 18){
                    System.out.println("Women");
                }
                else{
                    System.out.println("Girl");
                }
                break;
            case "M":
                if(age >= 18){
                    System.out.println("Man");
                }
                else{
                    System.out.println("Boy");
                }
                break;
        }
        sc.close();
        System.out.println("the end");
    }
}
