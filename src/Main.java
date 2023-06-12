public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {System.out.println(i);}

        //Задание номер 2
        for (int e = 10; e >= 1; e = e - 1) {System.out.println(e);}

        //Задание номер 3
        for (int w = 0; w <= 17; w++) {
            if (w % 2 == 0) {System.out.println(w);}
        }

        //Задание номер 3 версия 2
        for (int q = 0; q <= 17; q = q + 2) {System.out.println(q);}

        //Задание номер 4
        for (int r = 10; r >= -10; r = r - 1) {System.out.println(r);}

        //Задание номер 5
        for (int t = 1904; t <= 2096; t = t + 4) {System.out.println(t + " Год является високосным");}

        //Задание номер 6
        for (int c = 7; c <= 98; c = c + 7) {System.out.print(c);}
        System.out.println();

        //Задание номер 7
        for (int y = 1; y <= 512; y = y * 2) {System.out.print(y+ " ");}
        System.out.println();

        //Задание номер 8
        int savings = 29000;
        int total = 0;
        for (int m = 0; m <= 12; m++) {
            total = total + savings;
            System.out.println(total);}

        //Задание номер 9
        int savings1 = 29000;
        int total1 = 0;
        for (int m1 = 1; m1 <= 12; m1++) {
            total1 = total1 + total1/100;
            total1 = total1 + savings1;
            System.out.println("Месяц " + m1 + ", cумма накоплений равна " + total1+ " рублей" );}

        //Задание номер 10
        int result;
        for (int ch= 1; ch <= 10; ch++) {
            result = 2 * ch;
            System.out.println(" 2 x " + ch + " = " +result);}

    }
}