import java.util.Scanner;

public class s411631020_10_22 {
    public static void main(String[] args) {
        /*
        // 取得輸入練習
        boolean mood;
        System.out.print("mood is good ? (true/false)");
        Scanner sc = new Scanner(System.in);
        mood = sc.nextBoolean();
        System.out.println("user's mood is good : " + mood);
        sc.close();
        
        
        // if條件分支練習
        boolean mood;
        System.out.print("mood is good ? (true/false)");
        Scanner sc = new Scanner(System.in);
        mood = sc.nextBoolean();
        System.out.println("user's mood is good : " + mood);
        if (mood == true) {
        System.out.println("if true, is good mood.");
        }
        System.out.println("it's all be fine.");
        sc.close();

        int ID, age;
        System.out.print("Input your ID? (Man=1/Women=2) ");
        Scanner sc = new Scanner(System.in);
        ID = sc.nextInt();
        System.out.print("Input your age? ");
        age = sc.nextInt();
        if(ID == 1 && age > 18){
            System.out.println("成年男子");
        }
        sc.close();
        // 另一個寫法:包在裡面
        if(ID == 1){
            if(age > 18){
                System.out.println("成年男子");
            }
        }
        */
        int grade;
        System.out.print("Input your score? ");
        Scanner sc = new Scanner(System.in);
        grade = sc.nextInt();
        if(grade < 60){
            System.out.println("FAIL");
        }else if(grade < 70){
            System.out.println("Study Harder");
        }else if (grade < 80) {
            System.out.println("OK");
        }else if(grade >= 80){
            System.out.println("Very Good");
        }
        sc.close();
    }
}
