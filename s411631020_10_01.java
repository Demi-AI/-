public class s411631020_10_01 {
    public static void main(String[] args) {
        //二進位練習：0b開頭就是二進位
        int i = 0b1101;
        System.out.println("2進位 0b1101=" + i);
        //十六進位練習：0x開頭就是二進位
        long j = 0xAF3;
        System.out.println("16進位 0xAF3=" +j);
        //八進位練習
        int k = 0752;
        System.out.println("8進位 0752=" + k);
        //long 數字結尾要加L,不然會錯誤,可存很長的變數
        long l = 1948941698478L;
        System.out.println("變數i=" + l);
        

        //空格練習：\t
        System.out.println("我最敬愛的國父\t孫中山先生");
        //換行練習：\n
        System.out.println("舉頭明月光\n低頭吃便當");
        System.out.println("TKUIM\nBEST");
        //雙引號練習：\"
        System.out.println("\"TKUIM BEST\"");
        //
        double PI = 3.14159;
        int r = 6;
        float area;
        System.out.println("area=" + r*r*PI);

        // float 數字結尾要加 f
        // double 比 float 大,可用大包小,不能用小包大
        float Pi = 3.14159f;
        int R = 6;
        double Area;
        Area = R*R*Pi;
        System.out.println(Area);

        // String練習:字串輸出
        String s1 = "舉頭明月光\n";
        String s2 = "低頭吃便當";
        String s3 = s1 + s2;
        System.out.println(s3);

        // 變數.length() 功能練習
        String s4 = "君不見黃河之水天上來，奔流到海不復回。君不見高堂明鏡悲白髮，朝如青絲暮成雪。人生得意須盡歡，莫使金樽空對月。天生我材必有用，千金散盡還復來。烹羊宰牛且爲樂，會須一飲三百杯。岑夫子，丹丘生。將進酒，杯莫停。與君歌一曲，請君爲我傾耳聽。鐘鼓饌玉不足貴，但願長醉不復醒。古來聖賢皆寂寞，惟有飲者留其名。陳王昔時宴平樂，斗酒十千恣歡謔。主人何為言少錢？徑須沽取對君酌。五花馬，千金裘。呼兒將出換美酒，與爾同銷萬古愁。";
        System.out.println("變數 s4 的長度:" + s4.length());

        final double pi;
        pi = 3.14;
        int t = 6;
        System.out.println(2*pi*t);
        

        String s = "我覺得今天上的都聽得懂!";
        int m = 5;
        System.out.println(s);
        System.out.println("課程熟悉程度:" + m);
    }
}