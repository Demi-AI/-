import java.util.Scanner;
public class s411631020_12_03 {
    public static void main(String[] args){
        /*
        // declare
        double[] students;
        // Setting value
        students = new double[5]; // create space only setting value
    
        // v1
        students[0] = 70;
        students[1] = 65;
        students[2] = 90;
        students[3] = 85;
        students[4] = 95;
        // v1 : print out all students elements
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);

        // v2 : use for-loop fill scores(+Scanner)
        Scanner sc = new Scanner(System.in);
        for (int arrIndex=0; arrIndex<students.length; arrIndex++) {
            System.out.print("Input No."+ (arrIndex+1) +" score: ");
            // check input will be double & int
            while(!sc.hasNextDouble()){
                System.out.print("Input No."+ (arrIndex+1) +" score(double type): ");
                sc.next(); // clear inputed data
            }
            students[arrIndex] = sc.nextDouble();
        }
        sc.close(); // no-close will be -5
        // v2 : use for-loop to print out all data
        for (int i=0; i<5; i++) {
            System.out.println(students[i]);
        }

        // v3 : for each print out
        for (double Score:students){ // students = new double[5], 有順序的從 0 開始提取
            System.out.println((int)Score); // 強制轉型double -> int
        }
        */

        // 1. create String array Named : LoveFruits, length = 5
        // 2. user input 5 fruits in every slot of LoveFruits
        // 3. print out 1,3,5 fruit in LoveFruits

        // 1 declare
        String[] LoveFruits = new String[5];
        // 2
        Scanner sc = new Scanner(System.in); // create sc
        // Lovefruits[0-4]
        for (int arrIndex=0; arrIndex<LoveFruits.length; arrIndex++) {
            System.out.print("Input No."+ (arrIndex+1) +" Lovefruits: ");
            // check input not Null
            while(!sc.hasNextLine()){
                System.out.print("Input No."+ (arrIndex+1) +" Lovefruits(something:String type): ");
                sc.next(); // clear inputed data
            }
            LoveFruits[arrIndex] = sc.nextLine();
        }
        sc.close(); // close scanner Named sc
        // 3
        // 為什麼要 nowFruitPlace+=2, 因為我們要的 index 是 LoveFruits[0], LoveFruits[2], LoveFruits[4]
        for (int nowFruitPlace=0; nowFruitPlace<LoveFruits.length; nowFruitPlace+=2) { // nowFruitPlace+=2 -> nowFruitPlace = nowFruitPlace + 2
            System.out.println(LoveFruits[nowFruitPlace]);
        }
    }  
}
