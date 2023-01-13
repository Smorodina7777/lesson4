import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача1");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "  ");
            }
            System.out.println();
        }
        System.out.println();
        //Задача 2
        System.out.println("Задача2");
        int finish = 156;

        int num1 = 0;
        int num3 = 1;
        System.out.print(num3 + " ");
        for (int num2 = 1; num3 <= finish; num3 = num1 + num2) {
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
        System.out.println();
        num1 = 0;
        int num2 = 1;
        num3 = num1 + num2;
        System.out.print(num3 + " ");
        while (num3 <= finish) {
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
            num3 = num1 + num2;
        }
        System.out.println();
        num1 = 0;
        num2 = 1;
        num3 = num1 + num2;
        System.out.print(num3 + " ");
        do {
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
            num3 = num1 + num2;
        } while (num3 <= finish);
        System.out.println();
        //Задача 3
        System.out.println("Задача3");
        int num = 156;
        int sumN = 0;
        int n;

        for (int i = num; i > 0; i /= 10) {
            sumN += i % 10;

        }

        System.out.print(sumN + " ");
        sumN = 0;
        num = 156;
        while (num > 0) {
            sumN += num % 10;
            num /= 10;
        }
        System.out.print(sumN + " ");
        sumN = 0;
        num = 156;
        do {
            sumN += num % 10;
            num /= 10;
        } while (num > 0);
        System.out.print(sumN + " ");
        System.out.println();
        //Задача 4
        System.out.println("Задача4");
        String str = "У меня тут шалаш. Посмотришь?";
        str = str.toLowerCase();
        str = str.replace(",", " ");
        str = str.replace(".", " ");
        str = str.replace("!", " ");
        str = str.replace("?", " ");
        String[] strList = str.split(" ");
        int cnt = 0;
        for (int i = 0; i < strList.length; i++) {
            String reverseStr = new StringBuilder(strList[i]).reverse().toString();
            if (strList[i].equals(reverseStr) && strList[i].length() > 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println();
        //Задача 5*
        System.out.println("Задача5*");
        String time = "05:50";
        String time1 = time;
        char[] chars = time.toCharArray();
        if (chars[0] == '0') {
            time = time.substring(1, time.length());
        }
        String[] hMin = new String[2];
        hMin = time.split(":");
        int hour = Integer.parseInt(hMin[0]);
        int minute = Integer.parseInt(hMin[1]);

        cnt = -1;
        int[][] timeList = new int[24][60];
        for (int i = 0; i < 24; i++) {
            if (i > hour) {
                break;
            }
            for (int j = 0; j < 60; j++) {

                if (i / 10 == j % 10 && i % 10 == j / 10) {
                    if (i < hour || (i == hour && j <= minute)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println("Время " + time1 + " - Всего случаев: " + cnt);

        System.out.println();
        //Задача 5
        System.out.println("Задача 5");
        int month = 10;
        if (3 <= month && month <= 5) {
            System.out.println("Весна");
        } else if (6 <= month && month <= 8) {
            System.out.println("Лето");
        } else if (9 <= month && month <= 11) {
            System.out.println("Осень");
        } else if (month > 12) {
            System.out.println("Проверь месяц");
        } else {
            System.out.println("Зима");
        }
        System.out.println();
        //Задача 6
        System.out.println("Задача 6");
        String bin = "";
        int dec = 156;
        while (dec >= 1) {
            bin = (dec % 2) + bin;
            dec /= 2;
        }
        System.out.println(bin);
        Recursion.decToBin(156);
        System.out.println();
        //Задача 7
        System.out.println("Задача 7");
        System.out.println(Recursion.stepen(4));
        System.out.println();
        //Задача 8*
        System.out.println("Задача8*");
        Recursion.summa(156);


    }
}